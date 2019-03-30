package programmers.dynamicProgramming;

import java.util.Scanner;

/**
 * LDS(Longest Decreasing Subsequence)
 * 가장 긴 감소하는 부분 수열
 * */
public class LDS {
    static int[] a;
    static int[] d;
    static int[] v;

    static void go(int p){
        if(p == -1) return ;
        go(v[p]);
        System.out.print(a[p]+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        a = new int[n+1];
        d= new int[n+1];
        v = new int[n+1];
        for(int i =1; i<= n; i++)
            a[i] = sc.nextInt();

        for(int i=1; i<= n; i++){
            d[i] = 1;
            v[i] = -1;
            for(int j =1; j<=i; j++){
                if(a[j]> a[i] && d[i] <d[j]+1){
                    d[i] = d[j]+1;
                    v[i] = j;
                }


            }
        }

        int ans = d[1];
        for(int i = 2; i<= n; i++){
            if(ans <d[i])
                ans = d[i];
        }
        System.out.println(ans);
        go(n);
        System.out.println();
    }
}
