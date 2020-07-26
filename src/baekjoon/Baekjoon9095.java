package baekjoon;

import java.util.Scanner;

public class Baekjoon9095 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // 인자를 몇개 받을건지
        int n ;
        int[] output = new int[11];
        output[1] = 1;
        output[2] = 2;
        output[3] = 4;

        for(int i =0; i< t; i++){
            n = scanner.nextInt();
            for(int j =  4; j <= n; j++){
                output[j] = output[j-1] + output[j-2] + output[j-3];
            }
            System.out.println(output[n]);
        }

    }
}
