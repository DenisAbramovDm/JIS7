package homework.hospital.service;

import homework.hospital.model.DaysOfWeek;
import homework.hospital.model.Doctor;
import homework.hospital.model.Record;
import homework.hospital.model.Times;
import homework.hospital.model.User;
import homework.hospital.repository.Doctors;
import homework.hospital.repository.Users;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.XSlf4j;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

@Log4j
public class UserService {
    private static Set<DaysOfWeek> daysOfWeekSet = EnumSet.allOf(DaysOfWeek.class);
    private static Set<Times> timesSet = EnumSet.allOf(Times.class);

    public static void addUser(User user) {
        if (Users.users.containsKey(user.getUserName())) {
            System.out.println("This user already exists");
        } else Users.users.put(user.getUserName(), user);
    }

    public static void payForVisit(User user, int quantity){
        if (Users.users.containsKey(user.getUserName()) && quantity > 0){
            Users.users.get(user.getUserName()).increaseQuantityOfPayedVisits(quantity);
        } else System.out.println("user does not exist or payments quantity equals or less than zero");
    }

    private static boolean checkDoctorAndUserForAppointment(String userName, String doctorsSpecialisation){
        if (Users.users.containsKey(userName) && Doctors.doctors.containsKey(doctorsSpecialisation)){
            if (Users.users.get(userName).getQuantityOfPayedVisits() > 0){
                return true;
            } else log.info("At first pay for visit please");
        } else log.info("Something is wrong");
        return false;
    }

    private static void addUserToSchedule(String userName, String doctorsSpecialisation, DaysOfWeek day, Times time){
        Users.users.get(userName).addRecord(new Record(day, time, doctorsSpecialisation));
        Doctors.doctors.get(doctorsSpecialisation).schedule.putUser(day, time, Users.users.get(userName));
        Users.users.get(userName).decrementQuantityOfPayedVisits();
        log.info("Scheduling is successful");
    }

    private static void rescheduleRecordWhenTimeIsBusy(String userName, String doctorsSpecialisation, DaysOfWeek day, Times time){
        if(day.equals(DaysOfWeek.SUNDAY) && time.equals(Times.EIGHTH) && !Doctors.doctors.get(doctorsSpecialisation).schedule.schedule.get(day).timeSetUserMap.get(time).equals("empty")){
            log.info("All time of selected doctor is busy");
        }
        while (!(day.equals(DaysOfWeek.SUNDAY) && time.equals(Times.EIGHTH) && Doctors.doctors.get(doctorsSpecialisation).schedule.schedule.get(day).timeSetUserMap.get(time).equals("empty"))){
            if(time.compareTo(Times.EIGHTH) < 0){
                for (Iterator<Times> it = timesSet.iterator(); it.hasNext(); ) {
                    Times timeFromSet = it.next();
                    if (timeFromSet.equals(time)){
                        time = it.next();
                        appointment(userName, doctorsSpecialisation, day, time);
                        break;
                    }
                }
            } else {
                for (Iterator<DaysOfWeek> it = daysOfWeekSet.iterator(); it.hasNext(); ){
                    DaysOfWeek dayFromSet = it.next();
                    if (dayFromSet.equals(day)){
                        day = it.next();
                        time = Times.FIRST;
                        appointment(userName, doctorsSpecialisation, day, time);
                        break;
                    }
                }
            }
        }

    }

    public static void appointment(String userName, String doctorsSpecialisation, DaysOfWeek day, Times time) {
        if (checkDoctorAndUserForAppointment(userName, doctorsSpecialisation)) {
            if (Doctors.doctors.get(doctorsSpecialisation).schedule.schedule.get(day).timeSetUserMap.get(time).equals("empty")) {
                addUserToSchedule(userName, doctorsSpecialisation, day, time);
            }else rescheduleRecordWhenTimeIsBusy(userName, doctorsSpecialisation, day, time);
        }
    }


}
