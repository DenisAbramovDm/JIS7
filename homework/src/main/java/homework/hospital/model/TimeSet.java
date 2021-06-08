package homework.hospital.model;

public enum TimeSet {
    FIRST("08:00"),
    SECOND("08:30"),
    THIRD("09:00"),
    FOURTH("09:30"),
    FIVETH("10:00"),
    SIXTH("10:30"),
    SEVENTH("11:00"),
    EIGHTH("11:30");
    private String time;

    TimeSet(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

}
