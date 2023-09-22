import java.util.HashMap;
import java.util.Map;

public class Leetcode740 {
    public int deleteAndEarn(int[] nums) {
        Map<Integer, Integer> points = new HashMap<>();
        int maxNumber =0;
        for(int num: nums){
            points.put(num, points.getOrDefault(num, 0) + num);
            maxNumber = Math.max(maxNumber, num);
        }

        // base cases
        int twoBack =0;
        int oneBack = points.getOrDefault(1, 0);
        for(int num = 2; num < maxNumber; num++){
            int temp = oneBack;
            oneBack = Math.max(oneBack, Math.max(oneBack, twoBack+points.getOrDefault(num, 0)));
            twoBack = temp;
        }

        return oneBack;
    }
}
