package homework.lectureOne.mathOperations;
//**********@Checked***************//
import org.apache.log4j.Logger;
import java.util.Scanner;

public class MathOperationsDemo {
    private static double numberOne = 0;
    private static double numberTwo = 0;
    private static double result = 0;
    private static String operation;
    private static final Logger log = Logger.getLogger(MathOperationsDemo.class);
    private static Scanner in = new Scanner(System.in);


    public static void operate(){
        input();
        calculating(numberOne, numberTwo);
        log.info("Результат = " + result);
    }

    public static void input(){
        log.info("Введите первое число");
        numberOne = in.nextDouble();
        log.info("Введите +, -, * или /");
        operation = in.next();
        log.info("Введите второе число");
        numberTwo = in.nextDouble();
    }

    public static void calculating(double numberOne, double numberTwo) {
        switch (operation) {
            case "+": {
                result = numberOne + numberTwo;
                break;
            }
            case "-": {
                result =  numberOne - numberTwo;
                break;
            }
            case "*": {
                result = numberOne * numberTwo;
                break;
            }
            case "/": {
                result = numberOne / numberTwo;
                break;
            }
            default: result = 0;
        }

    }
}
