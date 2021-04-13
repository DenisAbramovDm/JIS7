package homework.methodsAndClasses;

import org.apache.log4j.Logger;

public class Encoder {
    public static final Logger log = Logger.getLogger(Encoder.class);
    public void encode(short code){
        log.info((char) code);
    }
    public void decode(char symbol){
        log.info((short) symbol);

    }
}
