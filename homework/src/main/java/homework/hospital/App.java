package homework.hospital;

import homework.hospital.model.DaysOfWeek;
import homework.hospital.model.Times;
import homework.hospital.repository.Doctors;
import homework.hospital.service.UserService;

public class App {
    public static void main(String[] args) {
        Doctors.initializeDoctors();
        UserService.appointment("valera", "urolog", DaysOfWeek.SUNDAY, Times.FIFTH);

    }
}
