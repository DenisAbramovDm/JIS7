package lectureOne.mathOperations;
//**********@Checked***************//
import org.apache.log4j.Logger;

import java.util.Scanner;

public class RandomGeneratorDemo {
    private static final Logger log = Logger.getLogger(MathOperationsDemo.class);
    private static Scanner in = new Scanner(System.in);
    private static int numberOne;
    private static int numberTwo;
    private static int numberThree;
    private static int summ;

    public static void generating(){
        log.info("Введите максимальное число");
        int range = in.nextInt();
        numberOne = (int) (Math.random() * range);
        log.info(numberOne);
        numberTwo = (int) (Math.random() * range);
        log.info(numberTwo);
        numberThree = (int) (Math.random() * range);
        log.info(numberThree);
    }

    public static void addition(){
        generating();
        summ = numberOne + numberTwo + numberThree;
        log.info("Сумма случайных чисел = " + summ);

    }

}
