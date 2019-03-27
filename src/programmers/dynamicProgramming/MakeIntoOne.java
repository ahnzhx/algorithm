package programmers.dynamicProgramming;

import java.util.Scanner;

/**
 * top-down 방식으로 푼 '1로 만들기'
 * */
public class MakeIntoOne {
    public static int[] d ; // go(n)의 답을 저장
    public static int go(int n ){
        if(n ==1)
            return 0;
        if(d[n] > 0)
            return d[n];
        d[n]= go(n-1)+1; // n-1일 때
        if(n%2 ==0){
            int temp = go(n/2)+1;
            if(d[n]> temp)
                d[n] = temp;
        }

        if(n%3 == 0){
            int temp = go(n/3)+1;
            if(d[n] > temp)
                d[n] = temp;
        }
        return d[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        d = new int[n+1];
        System.out.println(go(n));
    }
}
