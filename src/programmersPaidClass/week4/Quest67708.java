package programmersPaidClass.week4;

public class Quest67708 {
    static final int MOD = 1000000007;
    public int solution(int n) {
        long[] p = new long[5001];
        p[0] = 1;
        p[2] = 3;

        for(int i = 3; i <= n; i ++){
            if(i % 2 == 1) continue;
            p[i] += (p[i - 2] * 3) + 2;
            int k = 1;
            while(2*k != i - 2){
                p[i] += p[2 * k] * 2;
                k++;
            }
            p[i] %= MOD;
        }
        return (int) p[n];
    }
}
