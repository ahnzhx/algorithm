public class Leetcode2533 {
    public int goodBinaryStrings(int minLength, int maxLength, int oneGroup, int zeroGroup) {
        int mod = 1000000007;
        int ret =0;
        int[] dp = new int[maxLength+1];

        // initialization
        dp[0] =1; // there is one empty goodBS since 0 is a multiple of all numbers

        // dp
        for(int i =1; i <= maxLength; i++){
            if(i>= oneGroup) dp[i] = (dp[i] + dp[i-oneGroup])% mod;
            if(i>= zeroGroup) dp[i] = (dp[i] + dp[i-zeroGroup])% mod;
            if(i >= minLength) ret = (ret + dp[i]) %mod;
        }

        return ret% mod;
    }
}
