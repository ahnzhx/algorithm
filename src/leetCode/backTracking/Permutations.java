package leetCode.backTracking;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/permutations/
public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        findPermute(nums, new ArrayList<>(), resList, new boolean[nums.length]);
        return resList;
    }

    public static void findPermute(int[] nums, List<Integer> ans, List<List<Integer>> resList, boolean[] used){
        if(ans.size() == nums.length){
            resList.add(new ArrayList<>(ans));
            return ;
        }

        for (int i = 0; i < nums.length; i++){
            if(!used[i]){
                used[i] = true;
                ans.add(nums[i]);
                findPermute(nums, ans, resList, used);
                used[i] = false;
                ans.remove(ans.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permute(nums));
    }
}
