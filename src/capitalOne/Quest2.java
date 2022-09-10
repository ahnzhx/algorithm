package capitalOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Quest2 {
    public static int solution(String pattern, String source) {
        List<Character> vowelsChr = new LinkedList<>();
        vowelsChr.add('a');
        vowelsChr.add('e');
        vowelsChr.add('i');
        vowelsChr.add('o');
        vowelsChr.add('u');
        vowelsChr.add('y');

        char[] patternArr = pattern.toCharArray();
        int answer = 0;


        for(int i =0 ; i < source.length()-patternArr.length+1; i++){
            int patternCheck = 0;
            for(int j = 0 ; j < patternArr.length; j++){
                if(patternArr[j] == '0'){
                    if(vowelsChr.contains(source.charAt(j+i))){
                        patternCheck++;
                    }
                }else{
                    if(!vowelsChr.contains(source.charAt(j+i))){
                        patternCheck++;
                    }
                }
            }
            if(patternCheck == patternArr.length){
                answer++;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        String pattern = "010";
        String source = "amazing";
        solution(pattern, source);
    }

}
