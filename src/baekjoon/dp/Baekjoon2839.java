package baekjoon.dp;

import java.util.*;

public class Baekjoon2839 {

    public static int solution(int N){
        int count = 0;
        while(true){
            if(N % 5 == 0){
                return N/5 + count;
            } else if(N <= 0){
                return -1;
            }
            // N의 크기가 더 커지면 너무 느려지지 않을까?
            N = N -3;
            count++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(solution(N));
    }
}
