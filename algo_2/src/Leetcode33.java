public class Leetcode33 {
    public int search(int[] nums, int target) {
        int numsLength = nums.length; // 7
        int mid = numsLength/2; // 3
        int start =0;

        while(start != numsLength){
            if(nums[mid] == target) return mid;
            else {
                for(int i =start; i <mid; i++){
                    if(nums[i] == target) return i;
                }
                start = mid+1;
                mid = (start + numsLength-1)/2;
            }
        }
        return -1;


    }

}
