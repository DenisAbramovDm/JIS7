package homework.lecturetwo.arrays;

public class Copy {
    public int[] copyInRange(int[] in, int leftBound, int rightBound){
        int lengthOfNewArray = rightBound - leftBound + 1;
        int[] copiedArray = new int[lengthOfNewArray];
        for (int i = 0; i < lengthOfNewArray; i++) {
            copiedArray[i] = in[leftBound+i];
        }
        return copiedArray;
    }
}
