package leetCode;

public class MaximumProductSubarray {
    public static int maxProduct(int[] nums) {
        if(nums.length == 1) return nums[0];

        int max =  Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            int productValue = 1;
            int count = i;
            while(count < nums.length){
                productValue *= nums[count];
                max = Math.max(max, productValue);
                count++;
            }

        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums0 = new int[]{0,2};
        int[] nums = new int[]{-2, 0, -1};
        int[] nums2 = new int[]{2, 3, -2, 4};
        int[] nums3 = new int[]{-2};

        System.out.println(maxProduct(nums0));
        System.out.println(maxProduct(nums));
        System.out.println(maxProduct(nums2));
        System.out.println(maxProduct(nums3));
    }
}
