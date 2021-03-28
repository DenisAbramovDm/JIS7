import lectureOne.mathOperations.MathOperationsDemo;
import lectureOne.mathOperations.RandomGeneratorDemo;
import lectureTwo.arrays.ArraysDemo;
import lectureTwo.arrays.ArraysDemoAdv;

public class Application {
    public static void main(String[] args) {
       // MathOperationsDemo.operate();
        //RandomGeneratorDemo.addition();
      //  ArraysDemo arraysDemo = new ArraysDemo();
       // arraysDemo.combination();
        for (int i = 0; i < 100; i++) {
            ArraysDemoAdv.add(i*20);
        }

    }
}
