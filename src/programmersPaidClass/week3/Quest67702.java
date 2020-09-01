package programmersPaidClass.week3;

import java.util.Arrays;

public class Quest67702 {
    public int solution(String begin, String target, String[] words) {
        int answer =0 ;
        StringBuilder previousSb = new StringBuilder();

        if(!Arrays.stream(words).anyMatch(s -> s.equals(target))) return 0;
        for(String word : words){
            char[] beginArr = begin.toCharArray();
            char[] targetArr = target.toCharArray();
            StringBuilder compareSb = new StringBuilder();
            StringBuilder targetSb = new StringBuilder();

            for(int i =0; i< beginArr.length; i++){
                char[] wordArr = word.toCharArray();
                if(beginArr[i] == wordArr[i]) compareSb.append(beginArr[i]);
                if(beginArr[i] == targetArr[i]) targetSb.append(beginArr[i]);

                if(targetSb.length() == beginArr.length - 1){
                    if(!previousSb.toString().equals(targetSb.toString())){
                        answer++;
                        return answer;
                    }
                }

                if(compareSb.length() == beginArr.length - 1){
                    if(!previousSb.toString().equals(compareSb.toString())){
                        answer++;
                        previousSb = compareSb;
                        begin = word;
                    }


                }
                if(begin.equals(target)) break;
            }
        }
        if(!begin.equals(target)) answer =0;
        return answer;
    }
}
