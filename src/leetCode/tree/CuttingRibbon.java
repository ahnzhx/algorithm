package leetCode.tree;

public class CuttingRibbon {
    public static int maxLength(int[] ribbons, int k) {
        int ans = 0;
        int left = 1;
        int right = 100_000; // constraint max
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (isCutPossible(ribbons, mid, k)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    static boolean isCutPossible(int[] ribbons, int len, int count) {
        int currCount = 0;
        for (int ribbon : ribbons) {
            currCount += (ribbon / len);
        }
        return currCount >= count;
    }

    public static void main(String[] args) {
        int[] ribbons = {7,5,9};
        int k = 4;
        System.out.println(maxLength(ribbons, k));
    }
}
