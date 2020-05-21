package programmers.naverTest;

import java.util.Arrays;
import java.util.List;

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

    /**
     * O(n)으로 개선!
     * @param A
     * @param B
     * @return
     */
    public static int solution2(String A, String B) {
        int answer =0;
        char[] aCharArr = A.toCharArray();
        char[] bCharArr = B.toCharArray();
        char[] wordsCharArr = new char[aCharArr.length + bCharArr.length];
        System.arraycopy(aCharArr, 0, wordsCharArr,0, aCharArr.length);
        System.arraycopy(bCharArr, 0, wordsCharArr,aCharArr.length, bCharArr.length);

        Arrays.sort(wordsCharArr);

        for(int i =0 ; i<wordsCharArr.length-1 ; i+=2){
            if(wordsCharArr[i] == wordsCharArr [i+1]){
                wordsCharArr[i] = wordsCharArr [i+1] = 0;
            }
        }
        for(char wa : wordsCharArr){
            if(wa != 0){
                answer ++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        String A = "apple";
        String B = "pear";
        System.out.println(solution2(A,B));
    }
}
