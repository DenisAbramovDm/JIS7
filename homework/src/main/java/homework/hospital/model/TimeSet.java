package homework.hospital.model;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TimeSet {
    public Map<Times, Object> timeSetUserMap =
            Stream.of(new Object[][]{
                    {Times.FIRST, "Empty"},
                    {Times.SECOND, "Empty"},
                    {Times.THIRD, "Empty"},
                    {Times.FOURTH, "Empty"},
                    {Times.FIFTH, "Empty"},
                    {Times.SIXTH, "Empty"},
                    {Times.SEVENTH, "Empty"},
                    {Times.EIGHTH, "Empty"},})
                    .collect(Collectors.toMap(data ->
                            (Times) data[0], data -> data[1]));

    public void setUser(Times time, User user){
        timeSetUserMap.put(time, user);
    }
    public Object getUser(Times time){
        return timeSetUserMap.get(time);
    }
}

