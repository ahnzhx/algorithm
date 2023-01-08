import java.util.Arrays;

public class CombinationSumFour {
    public int combinationSum4(int[] nums, int target){
        int[] dp = new int[target+1];
        Arrays.sort(nums);

        for(int k =0 ; k <nums.length; k++){
            if(nums[k] <= target){
                dp[nums[k]] ++;
            }else{
                break;
            }
        }
        for(int j =nums[0]; j <= target; j++){
            for(int i =0; i < nums.length; i++){
                if(j >= nums[i]){
                    int finalI = nums[i];
                    int finalJ = j;
                    if(Arrays.stream(nums).anyMatch(val -> val == finalJ - finalI) || dp[finalJ - finalI] > 0){
                        dp[finalJ] += dp[finalJ - finalI];
                    }

                }else{
                    break;
                }

            }
        }

        return dp[target];
    }
}
