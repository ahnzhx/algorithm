package leetCode;

public class SingleNumberThree {
    public static int[] singleNumber3(int[] nums) {
        int bitmask =0;
        for(int num : nums){
            bitmask ^= num;
        }
        int diff = bitmask & (-bitmask);

        int x =0;
        for(int num: nums){
            if((num & diff) != 0) {
                x ^= num;
            }
        }
        return new int[]{x, bitmask^x};
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5};
        int[] ret = singleNumber3(nums);
        for(int el : ret){
            System.out.println(el);
        }


    }
}
