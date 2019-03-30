package programmers.dynamicProgramming;

import java.util.Scanner;

/**
 * (*중요)가장 긴 증가하는 부분수열
 * (LIS: Longest Increasing Subsequence)
 * */
public class LIS {
    static int[] a;
    static int[] d;
    static int[] v;

    //반대로 출력하는 재귀.... 대단하다
    static void go(int p){
        if(p == -1) return ;
        go(v[p]);
        System.out.print(a[p]+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        a = new int[n];
        for(int i =0; i<n; i++)
            a[i] = sc.nextInt();

        d = new int[n];
        v = new int[n];
        for(int i =0; i<n; i++){
            d[i] = 1;
            v[i] = -1;
            for(int j =0; j<i; j++){
                if(a[j] < a[i] && d[i] < d[j]+1){
                    d[i] = d[j]+1;
                    v[i] = j;
                }


            }
        }

        int ans = d[0];
        int p = 0;
        for(int i =0; i<n; i++){
            if(ans <d[i]){
                ans = d[i];
                p =i; // 구한 배열의 맨 끝으로감
            }

        }
        System.out.println(ans);
        go(p);
        System.out.println();

    }
}
