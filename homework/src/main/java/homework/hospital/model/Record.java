package homework.hospital.model;

import java.util.Objects;

public class Record {
    private final DaysOfWeek day;
    private final Times time;
    private final String doctor;

    public Record(DaysOfWeek day, Times time, String doctor) {
        this.day = day;
        this.time = time;
        this.doctor = doctor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Record record = (Record) o;
        return day == record.day && time == record.time && Objects.equals(doctor, record.doctor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, time, doctor);
    }

    @Override
    public String toString() {
        return "Record{" +
                "day=" + day +
                ", time=" + time +
                ", doctor='" + doctor + '\'' +
                '}';
    }
}
