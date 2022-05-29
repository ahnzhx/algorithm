package leetCode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {

    public static List<List<Integer>> combinationSum3(int k, int n){
        List<Integer> comb = new ArrayList<>();
        List<List<Integer>> op = new ArrayList<>();

        helper(op, comb, k, 1, n);
        return op;
    }

    public static void helper(List<List<Integer>> op, List<Integer> comb, int k, int start, int n){
        if(comb.size() == k && n == 0){
            List<Integer> li = new ArrayList<>(comb);
            op.add(li);
            return ;
        }

        for(int i = start; i < 10; i++){
            if(comb.size() < k){
                comb.add(i);
                helper(op, comb, k, i+1, n-i);
                comb.remove(comb.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int k = 3; int n = 9;
        System.out.println(combinationSum3(k, n));

    }
}
