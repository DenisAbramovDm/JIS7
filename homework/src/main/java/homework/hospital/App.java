package homework.hospital;

import homework.hospital.model.DaysOfWeek;
import homework.hospital.model.Times;
import homework.hospital.model.User;
import homework.hospital.repository.Doctors;
import homework.hospital.repository.Users;
import homework.hospital.service.UserService;

public class App {
    public static void main(String[] args) {
        Doctors.initializeDoctors();
        UserService.addUser(new User("Valera"));
        Users.users.get("Valera").increaseQuantityOfPayedVisits(5);

        UserService.appointment("valera", "lor", DaysOfWeek.TUESDAY, Times.FIFTH);

    }
}
