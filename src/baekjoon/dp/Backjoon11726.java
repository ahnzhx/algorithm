package baekjoon.dp;

import java.util.Scanner;

public class Backjoon11726 {
    static final int MOD = 10_007;
    public static int solution(int n){
        int[] d = new int[n+1];

        d[0] = 0;
        d[1] = 1;
        d[2] = 2;

        for(int i =3 ; i <= n ; i++){
            d[i] =( d[i-1] + d[i-2]) % MOD;
        }
        return d[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(solution(n));
    }
}
