package homework.hospital.model;

import java.util.HashMap;
import java.util.Map;

public class Timetable {


    public Map<DaysOfWeek, TimeSet> schedule;

    {
        Map<DaysOfWeek, TimeSet> map = new HashMap<>();
        for (Object[] data : new Object[][]{
                {DaysOfWeek.MONDAY, new TimeSet()},
                {DaysOfWeek.TUESDAY, new TimeSet()},
                {DaysOfWeek.WEDNESDAY, new TimeSet()},
                {DaysOfWeek.THURSDAY, new TimeSet()},
                {DaysOfWeek.FRIDAY, new TimeSet()},
                {DaysOfWeek.SATURDAY, new TimeSet()},
                {DaysOfWeek.SUNDAY, new TimeSet()},}) {
            if (map.put((DaysOfWeek) data[0], (TimeSet) data[1]) != null) {
                throw new IllegalStateException("Duplicate key");
            }
        }
        schedule = map;
    }


    public void putUser(DaysOfWeek day, Times time, User user) {
        schedule.get(day).setUser(time, user);

    }

}
