package baekjoon;

import java.util.*;

public class Baekjoon15829 {
    public static long solution(String str){
        char[] strs = str.toCharArray();
        long sum  = 0l;
        for(int i =0; i < strs.length; i++){
            long multiplied = 1;
            for(int j = 0 ; j < i ; j ++){
                multiplied *= 31 * j % 1234567891;
            }
            sum += (strs[i] - '`') * multiplied;
        }
        return sum % 1234567891;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String input = "";
        while(input.length() != size){
            input = sc.nextLine();
        }
        System.out.println(solution(input));
    }
}
