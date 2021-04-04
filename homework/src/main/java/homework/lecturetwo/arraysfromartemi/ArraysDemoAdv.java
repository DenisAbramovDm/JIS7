package homework.lecturetwo.arraysfromartemi;

import org.apache.log4j.Logger;

//**********@Checked***************//
import java.util.Arrays;

public class ArraysDemoAdv {
    private static final Logger log = Logger.getLogger(ArraysDemoAdv.class);
    public static int[] extensibleArray = new int[5];
    public static int counter = 0;

    public static int[] add(int number) {

        if (counter < extensibleArray.length) {
            extensibleArray[counter] = number;
            counter++;
        } else {
            extensibleArray = Arrays.copyOf(extensibleArray, (int) (extensibleArray.length * 1.5));
        }
        log.info(Arrays.toString(extensibleArray));
        return extensibleArray;
    }
}
