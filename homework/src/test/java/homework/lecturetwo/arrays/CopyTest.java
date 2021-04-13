package homework.lecturetwo.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CopyTest {

    @Test
    void copyInRangeTest() {
        Copy c = new Copy();
        int[] in = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        System.out.println(Arrays.toString(c.copyInRange(in, 1, 12))  );

    }
}