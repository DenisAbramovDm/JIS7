package homework.methodsAndClasses;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class EncoderDemo {
    private static Scanner in = new Scanner(System.in);
    public static Encoder encoder = new Encoder();
    public static Logger log = Logger.getLogger(EncoderDemo.class);
    public static void main(String[] args) {
        log.info("Input a symbol code");
        encoder.encode(in.nextShort());
        log.info("input a symbol");
        String secondInput = in.next();
        char inputToDecode = secondInput.charAt(0);
        encoder.decode(inputToDecode);

    }
}
