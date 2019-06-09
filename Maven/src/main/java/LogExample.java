import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class LogExample {

    private Logger log;

    public LogExample() {
        this.log = Logger.getLogger(LogExample.class.getName());
        BasicConfigurator.configure();
    }

    public void runExample(){
        log.info("Test info");
        log.error("Test error");
        log.debug("Test debug");
        System.out.println("Test");
    }
}
