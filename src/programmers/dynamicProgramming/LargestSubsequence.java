package programmers.dynamicProgramming;

import java.util.Scanner;

/**
 * 가장 큰 증가 부분 수열
 * */
public class LargestSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0; i<n; i++)
            a[i] = sc.nextInt();

        int[] d = new int[n];
        for(int i =0; i<n; i++){
            d[i] = a[i];
            for(int j =0; j<i; j++){
                if(a[j]<a[i] && d[i]<d[j]+a[i])
                    d[i] = d[j]+a[i];
            }
        }

        int ans = d[0];
        for(int largest: d){
            if(ans <largest)
                ans = largest;
        }

        System.out.println(ans);
    }
}
