package programmers.naverTest;

import java.util.Queue;

public class Task2 {
    //anagram
    public static int solution(String A, String B) {
        char[] aCharArr = A.toCharArray();
        char[] bCharArr = B.toCharArray();
        int answer =0;
        while(true){
            for(int j =0 ; j < aCharArr.length ; j++){
                for(int i =0 ; i<bCharArr.length; i++){
                    if(aCharArr[j] == bCharArr[i]){
                        aCharArr[j] = 0;
                        bCharArr[i] = 0;
                        break;
                    }
                }
            }

            for(char ac : aCharArr){
                if(ac != 0){
                   answer ++;
                }
            }
            for(char bc : bCharArr){
                if(bc != 0){
                    answer ++;
                }
            }
            break;
        }
        return answer;
    }

    public static void main(String[] args) {
        String A = "apple";
        String B = "pear";
        System.out.println(solution(A,B));
    }
}
