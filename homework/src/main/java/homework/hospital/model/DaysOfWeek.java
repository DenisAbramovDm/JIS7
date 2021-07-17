package homework.hospital.model;

public enum DaysOfWeek {
    MONDAY ("Monday"),
    TUESDAY ("Tuesday"),
    WEDNESDAY ("Wednesday"),
    THURSDAY ("Thursday"),
    FRIDAY ("Friday"),
    SATURDAY ("Saturday"),
    SUNDAY ("Sunday");

    private String title;

    DaysOfWeek(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
