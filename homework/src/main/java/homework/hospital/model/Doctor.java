package homework.hospital.model;

public class Doctor {
    private String specialisation;
    public Timetable schedule = new Timetable();


    public Doctor(String specialisation) {
        this.specialisation = specialisation;
    }
    public String getSpecialisation(){
        return this.specialisation;
    }
}
