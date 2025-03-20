
import java.util.*;

public class Test7 {
    public static int[] solution(String[] cpr) {
        Map<String, Integer> order = new HashMap<>();
        order.put("check", 1);
        order.put("call", 2);
        order.put("pressure", 3);
        order.put("respiration", 4);
        order.put("repeat", 5);

        int[] result = new int[cpr.length];
        for (int i = 0; i < cpr.length; i++) {
            result[i] = order.get(cpr[i]);
        }

        return result;
    }
}
