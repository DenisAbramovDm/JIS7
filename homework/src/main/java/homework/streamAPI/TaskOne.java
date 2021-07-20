package homework.streamAPI;

import lombok.extern.log4j.Log4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Log4j
public class TaskOne {
    public static void main(String[] args) {

        List<Integer> evenNumberList = new Random()
                .ints()
                .limit(100)
                .boxed()
                .collect(Collectors.toList());

        evenNumberList = evenNumberList.stream()
                .filter(r -> (r % 2) == 0)
                .collect(Collectors.toList());
        log.info(evenNumberList);


    }
}
