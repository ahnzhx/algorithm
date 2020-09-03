package programmersPaidClass.week3;

import java.util.*;

public class Quest67702 {
    public int solution(String begin, String target, String[] words) {
        int answer =0 ;
        Map<String, Boolean> wordsMap = new HashMap<>();
        Stack<String> stack = new Stack<>();

        if(!Arrays.stream(words).anyMatch(s -> s.equals(target))) return 0;

        for(String word : words) wordsMap.put(word, false);

        stack.push(begin);
        String compare = "";
        while(!stack.isEmpty()){
            compare = stack.pop();
            char[] compareArr = compare.toCharArray();

            if(target.equals(compare)) break;

            for(String word : words){
                int count = 0;
                char[] wordArr = word.toCharArray();

                for(int i =0 ; i < compareArr.length; i++){
                    if(wordsMap.get(word)) continue;
                    if(compareArr[i] == wordArr[i]) {
                        count++;
                    }

                    if(count == wordArr.length-1){
                        wordsMap.computeIfPresent(word, (k,v) -> v = !v);
                        stack.push(word);
                    }
                }

            }
            answer += 1;
        }

        if(!compare.equals(target)) answer = 0;
        return answer;
    }

}
