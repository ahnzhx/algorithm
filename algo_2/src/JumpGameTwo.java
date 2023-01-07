import java.util.Arrays;

public class JumpGameTwo {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        int startingPoint ;
        for(int i =0; i < nums.length-1; i++){
            if(nums[i]+i > nums.length-1){
                startingPoint = nums.length-1-i;
            }else{
                startingPoint = nums[i];
            }
            for(int j=startingPoint ; j>0; j--){
                if(dp[i+j] > 0){
                    dp[i+j] = Math.min(dp[i]+1, dp[i+j]);
                }else{
                    dp[i+j] = dp[i]+1;
                }

            }
        }

        return dp[nums.length-1];
    }

}
