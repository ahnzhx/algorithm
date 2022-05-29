package leetCode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum2 {
    static List<List<Integer>> ret = new ArrayList<>();
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        permutation(candidates, 0, 0, new ArrayList<>(), target );

        return ret;
    }

    public static void permutation(int[] candidates, int curr_idx, int curr_sum, List<Integer> curr_arr, int target){
        if(curr_sum == target){
            List<Integer> answerList = new ArrayList<>();
            answerList.addAll(curr_arr);
            ret.add(answerList);
        }else if(curr_sum < target) {
            for (int i = curr_idx; i < candidates.length; i++) {
                curr_arr.add(candidates[i]);
                permutation(candidates, i, curr_sum + candidates[i], curr_arr, target);
                curr_arr.remove(curr_arr.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;

        System.out.println(combinationSum2(candidates, target));
    }
}
