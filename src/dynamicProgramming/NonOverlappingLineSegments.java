package dynamicProgramming;

// https://leetcode.com/problems/number-of-sets-of-k-non-overlapping-line-segments/
public class NonOverlappingLineSegments {
    static Integer dp[][][];
    static int c1;
    static int c2;
    static int mod = 1000000007; // 소수

    public static int check(int a, int b, int c){
        if(dp[a][b][c] != null)
            return dp[a][b][c];
        if(c == c2)
            return 1;
        if(b == c1)
            return 0;
        int a1 = check(a, b+1, c);
        if(a == 0)
            a1 += check(1, b+1, c);
        else
            a1 += check(0, b, c+1);

        dp[a][b][c] = a1 % mod;
        return dp[a][b][c];
    }

    public static int numberOfSets(int n, int k) {
        c1 = n;
        c2 = k;
        dp = new Integer[2][n+1][k+1];
        return check(0,0,0) % mod;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSets(4,2));
//        System.out.println(numberOfSets(3,1));
    }
}
