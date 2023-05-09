import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < source.size(); i++) {
            if (source.get(i) < threshold) {
                result.add(source.get(i));
            } else {
                logger.log("Number " + source.get(i) + " | index: " + i + " is larger than threshold thus can't be added");
            }
        }

        return result;
    }
}
