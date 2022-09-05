package leetCode.backTracking;


import java.util.ArrayList;
import java.util.List;

// 풀었는데 왜 ide랑 leetcode랑 답이 다르게 나오냐고
public class PermutationSequence {
    static List<StringBuilder> resList = new ArrayList<>();

    public static String getPermutation(int n, int k) {
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = i+1;
        }
        findPermute2(nums, new StringBuilder(), resList, new boolean[nums.length], k);

        return resList.get(k-1).toString();
    }

    public static void findPermute2(int[] nums, StringBuilder sb, List<StringBuilder> resList, boolean[] used, int k){
        if(resList.size() == k) return;
        if(sb.length() == nums.length){
            resList.add(new StringBuilder(sb));
            return ;
        }

        for(int i =0; i < nums.length; i++){
            if(!used[i]){
                sb.append(nums[i]);
                used[i] = true;
                findPermute2(nums, sb, resList, used, k);
                sb.delete(sb.length()-1, sb.length());
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(getPermutation(4, 9));
    }
}
