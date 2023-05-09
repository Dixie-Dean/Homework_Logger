import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getInstance();

        logger.log("Launching the app");
        logger.log("Enter the length of the list (0 < x <= 20) ");

        int length;
        while (true) {
            length = scanner.nextInt();
            if (length > 0 & length <= 20) {
                logger.log("Correct input");
                break;
            } else {
                logger.log("Inadequate value! Repeat input");
            }
        }

        logger.log("Creating an empty list of integers");
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        logger.log("Enter max value (int)");
        int maxValue = scanner.nextInt();
        logger.log("Value accepted");

        logger.log("Filling up the list");
        for (int i = 0; i < length; i++) {
            list.add(random.nextInt(maxValue));
        }
        logger.log("List: " + list);

        logger.log("Enter threshold for filter (x < max value)");
        int threshold;
        while (true) {
            threshold = scanner.nextInt();
            if (threshold < maxValue) {
                logger.log("Correct input");
                break;
            } else {
                logger.log("Inadequate value! Repeat input");
            }
        }

        logger.log("Launching filter");
        Filter filter = new Filter(threshold);
        List<Integer> filteredList = filter.filterOut(list);
        logger.log("New list: " + filteredList);

        logger.log("Finishing the app");
    }
}