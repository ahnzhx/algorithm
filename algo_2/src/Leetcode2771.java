public class Leetcode2771 {
    public int maxNonDecreasingLength(int[] nums1, int[] nums2) {
        int res =1, dp1 = 1, dp2 =1, n=nums1.length, t11, t12, t21,t22;

        for(int i = 1; i < nums1.length; i++){
            t11 = nums1[i-1] <= nums1[i]? dp1 +1:1;
            t12 = nums1[i-1] <= nums2[i]? dp1 +1:1;
            t21 = nums2[i-1] <= nums1[i]? dp2 +1:1;
            t22 = nums2[i-1] <= nums2[i]? dp2 +1:1;

            dp1 = Math.max(t11, t21);
            dp2 = Math.max(t12, t22);
            res = Math.max(res, Math.max(dp1, dp2));
        }
        return res;
    }
}
