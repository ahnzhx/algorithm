package leetCode;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        if(nums.length == 1) return nums[0];
        int max = Integer.MIN_VALUE;

        

        return max;
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