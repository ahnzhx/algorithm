package FibonacciNumbers;

import java.util.ArrayList;
import java.util.List;

public class WhoseSumIsK {
    public static int findMinFibonacciNumbers(int k) {
        int res = 0;
        List<Integer> fibs = new ArrayList<>();
        fibs.add(1);
        fibs.add(1);

        while(fibs.get(fibs.size()-1) < k){
            fibs.add(fibs.get(fibs.size()-1) + fibs.get(fibs.size()-2) );
        }

        for(int i = fibs.size()-1; i >= 0; i--){
            if(fibs.get(i) <= k){
                k -= fibs.get(i);
                res ++;
            }

            if(k == 0){
                break;
            }
        }

        return res;
    }

    public static void main(String[] args) {

//        System.out.println(findMinFibonacciNumbers(7));
        System.out.println(findMinFibonacciNumbers(10));
        System.out.println(findMinFibonacciNumbers(19));
    }
}
