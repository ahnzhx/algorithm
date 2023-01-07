public class JumpGameTwo {
    int result = Integer.MAX_VALUE;
    public int jump(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        for(int i = nums[0]; i > 0; i--){
            helper( i, nums, nums[0], 1);
        }

        return result;
    }
    void helper(int index, int[] nums, int jump, int count){
        if (index == nums.length-1){
            result = Math.min(count, result);
        } else if(index < nums.length-1){
            for(int j = nums[index]; j > 0; j--){
                if(jump < nums.length){
                    helper(index+j, nums, nums[jump], count+1);
                }

            }

        }
    }
}
