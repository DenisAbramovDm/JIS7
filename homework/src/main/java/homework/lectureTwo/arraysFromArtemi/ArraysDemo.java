package homework.lectureTwo.arraysFromArtemi;
//**********@Checked***************//
import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;
import java.util.Arrays;

public class ArraysDemo {
    private static final Logger log = Logger.getLogger(ArraysDemo.class);
    public int[] demoArray = {23, 84, 234, 432, 1};

    public void sorting(){
        log.info("первый массив" + Arrays.toString(demoArray));
        Arrays.sort(demoArray);
        log.info("сортированный массив" + Arrays.toString(demoArray));
    }

    public int[] reverse(int[] demoArray){
        int[] demoArrayReversed = new int[demoArray.length];
        for (int i = 0; i < demoArray.length; i++) {
            demoArrayReversed[demoArray.length - 1 - i] = demoArray[i];
        }
        log.debug("перевернутый массив" + Arrays.toString(demoArrayReversed));
        return demoArrayReversed;
    }

    public void combination(){
        this.sorting();
        int[] combinedArray = ArrayUtils.addAll(demoArray, this.reverse(demoArray));
        log.info(Arrays.toString(combinedArray));

    }

}
