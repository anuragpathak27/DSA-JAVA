import java.util.HashMap;
import java.util.Map;

public class singlenumber2 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,2,3,3,3};

        Map<Integer, Integer> mp = new HashMap<>();
        for (int i : nums) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
