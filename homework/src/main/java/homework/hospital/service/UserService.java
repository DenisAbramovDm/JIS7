package homework.hospital.service;

import homework.hospital.model.DaysOfWeek;
import homework.hospital.model.Doctor;
import homework.hospital.model.Times;
import homework.hospital.model.User;
import homework.hospital.repository.Doctors;
import homework.hospital.repository.Users;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.XSlf4j;

@Log4j
public class UserService {
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

    public static void appointment(String userName, String doctorsSpecialisation, DaysOfWeek day, Times time){
        if (Users.users.containsKey(userName) && Doctors.doctors.containsKey(doctorsSpecialisation)){
            if (Users.users.get(userName).getQuantityOfPayedVisits() > 0){
                //TODO
                if (Doctors.doctors.get(doctorsSpecialisation).schedule.schedule.get(day).timeSetUserMap.get(time).equals("empty"))
            } else System.out.println("At first pay for visit please");
        } else System.out.println("Something is wrong");
    }
}
