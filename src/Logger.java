import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Logger {
    private int num = 1;

    private static Logger logger;

    private Logger() {}

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    private final LocalTime time = LocalTime.now();

    public void log(String message) {
        System.out.println("["
                + LocalDate.now() + " | "
                + time.getHour() + ":" + time.getMinute() + ":" + time.getSecond()
                + "]"
                + " ("+ num++ +"): "
                + message);
    }
}