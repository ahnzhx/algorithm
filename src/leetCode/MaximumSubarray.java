package leetCode;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int currentSubarray = nums[0];
        int maxSubarray = nums[0];

        for(int i =1; i < nums.length ; i++){
            int num = nums[i];

            currentSubarray = Math.max(num, currentSubarray+num);
            maxSubarray = Math.max(maxSubarray,currentSubarray);
        }

        return maxSubarray;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums1 = {1};
        int[] nums2 = {5,4,-1, 7, 8};
        int[] nums3 = {-2,-1};
        int[] nums4 = {1,-1,1};
        int[] nums5 = {8,-19,5,-4,20};

        System.out.println(maxSubArray(nums));
        System.out.println(maxSubArray(nums1));
        System.out.println(maxSubArray(nums2));
        System.out.println(maxSubArray(nums3));
        System.out.println(maxSubArray(nums4));
        System.out.println(maxSubArray(nums5));
    }

}