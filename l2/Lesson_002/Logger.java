package Lesson_002;
import java.io.IOException;
import java.util.logging.*;

public class Logger {
       public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Logger.class.getName());
        ConsoleHandler ch = new ConsoleHandler();

        logger.addHandler(ch);

        XMLFormatter xml = new XMLFormatter();

        ch.setFormatter(xml);

        logger.log(Level.WARNING, "Test Logger 1");
        logger.info("Test Logger 2");
        
    }
}
