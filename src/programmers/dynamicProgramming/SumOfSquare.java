package programmers.dynamicProgramming;

import java.util.Scanner;

/**
 * 제곱수의 합
 * 주어진 자연수 N을 제곱수들의 합으로 표현할 때에
 * 그 항의 최소개수를 구하는 문제
 */
public class SumOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n+1];
        for(int i=1; i<=n; i++){
            d[i] = i;
            for(int j =1; j*j <= i; j++){
                if(d[i]> d[i-j*j]+1)
                    d[i] =d[i-j*j]+1;
            }
        }
        System.out.println(d[n]);
    }

}
