package leetCode;

public class SingleNumberOne {
    public static int singleNumber(int[] nums) {
        int a =0;
        for(int i : nums){
            a ^= i;
        }
        return a;
    }

    public static void main(String[] args) {
//        int[] nums = {2,2,1};
        int[] nums = {4,1,2,1,2};
//        System.out.println(singleNumber(nums));
    }
}
