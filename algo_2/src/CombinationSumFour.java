public class CombinationSumFour {
    int result ;
    public int combinationSum4(int[] nums, int target){

        int sum =0;
        for(int i =0; i < nums.length; i++){
            helper(sum + nums[i], nums, target);
        }
        System.out.println(result);
        return result;
    }

    public void helper(int sum, int[] nums, int target){
        if(sum > target){
            return;
        }
        if(sum == target){
            result++;
            return;
        }
        for(int j =0; j < nums.length; j++){
            helper(sum + nums[j], nums, target);
        }
    }
}
