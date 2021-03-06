package homework.lecturetwo.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayServiceTest {
    ArrayService myArr = new ArrayService();
    int[] arr = new int[50];
    @Test
    void createTest() {

        int size = 10;
       // System.out.println(myArr.create(size).length);
        assertEquals(size, myArr.create(size).length);
    }


    @Test
    void fillRandomlyTest() {
        myArr.fillRandomly(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    void printArrayTest() {
        myArr.fillRandomly(arr);
        myArr.printArray(arr);
    }

    @Test
    void sumTest() {
        myArr.fillRandomly(arr);
        System.out.println(myArr.sum(arr));
    }

    @Test
    void avgTest() {
        myArr.fillRandomly(arr);
        System.out.println(myArr.avg(arr));
    }

    @Test
    void sortTest() {
        myArr.fillRandomly(arr);
     int[]  arrForTest = arr;
     int[] expectedArray = Arrays.copyOf(arrForTest, arrForTest.length);
        Arrays.sort(expectedArray);
        myArr.sort(arrForTest);
        assertArrayEquals(expectedArray, arrForTest);

    }

    @Test
    void swapTest() {
        myArr.fillRandomly(arr);
        myArr.sort(arr);
        System.out.println(Arrays.toString(arr));
        myArr.swap(arr);
        System.out.println(Arrays.toString(arr));
    }
}