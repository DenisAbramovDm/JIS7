
package homework.lecturetwo.arrays;

import java.util.concurrent.ThreadLocalRandom;

public class ArrayService {

   public int[] newArray;

    public int[] create(int size){
        newArray = new int[size];
        return newArray;
    }

    public void fillRandomly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(0, 100);
        }

    }
    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    public int sum(int[] array) {
        int sumM = 0;
        for (int elem : array) {
            sumM += elem;
        }
        return sumM;

    }
    public double avg(int[] array) {
        double average = 0;
        if (array.length != 0){
            average = (double)sum(array) / array.length;
            return  average;
        } else return 0;
    }

    public void sort(int[] array) {
        int gap = array.length / 2;
        while (gap >= 1) {
            for (int right = 0; right < array.length; right++) {
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (array[c] > array[c + gap]) {
                        int tmp = array[c];
                        array[c] = array[c + gap];
                        array[c + gap] = tmp;
                    }
                }
            }
            gap = gap / 2;
        }
    }
    public void swap(int[] array){
        int temp = 0;
        for (int i = 0; i < (array.length/2); i++){
            temp = array[i];
            array[i] = array[array.length - (i + 1)];
            array[array.length - (i + 1)] = temp;
        }
    }
}
