package homework.streamAPI;

import lombok.extern.log4j.Log4j;

import java.util.List;

@Log4j
public class TaskTwo {
    static void filterStringWithStartOrEnd(String match, List<String> listOfStrings) {
        listOfStrings.stream()
                .filter(s -> s.startsWith(match) || s.endsWith(match))
                .forEach(s -> log.info(s));

    }

    public static void main(String[] args) {
        List<String> myStringCollection = List.of("valera", "anklav", "balka", "maksim", "ivan", "makaron", "foreign");
        filterStringWithStartOrEnd("v", myStringCollection);

    }


}
