package leetCode;

import java.util.ArrayList;
import java.util.List;

public class climbingStairs {
    static int cnt = 0;
    static List<Integer> result = new ArrayList<>();

    // time limit exceeded
    public static int climbStairs(int n) {

        result.add(1);
        result.add(2);

        for(int i = 2 ; i < n; i++){
            result.add(result.get(i-2) +result.get(i-1));
        }

        return result.get(n-1);
    }

    public static void main(String[] args) {
//        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
    }

}
