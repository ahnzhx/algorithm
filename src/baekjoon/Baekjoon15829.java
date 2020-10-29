package baekjoon;

import java.util.*;

//50점?
public class Baekjoon15829 {
    public static long solution(String str){
        char[] strs = str.toCharArray();
        long sum  = 0l ;
        for(int i =0 ; i < strs.length ; i++){
            sum += (strs[i] - 96) * Math.pow(31, i);
        }
        return sum;
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
