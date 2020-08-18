package programmersPaidClass.week1;

import java.util.HashSet;
import java.util.Set;

public class Quest67680 {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Set<String> ending = new HashSet<>();

        char wordLastLetter = getWordLastLetter(words[0]);
        ending.add(words[0]);

        // TODO: nested if 로 바꾸기
        for(int i =1 ; i< words.length; i++){
            if(!ending.contains(words[i]) && words[i].startsWith(wordLastLetter + "")){
                ending.add(words[i]);
            } else if(ending.contains(words[i]) || !words[i].startsWith(wordLastLetter + "")){
                if((i+1) % n == 0){
                    answer[0] = n;
                    answer[1] = (i+1) / n;
                }else{
                    answer[0] = (i+1) % n;
                    answer[1] = (i+1) / n + 1;
                }
                return answer;
            }
            wordLastLetter = getWordLastLetter(words[i]);
        }
        answer[0] = 0;
        answer[1] = 0;

        return answer;
    }

    private char getWordLastLetter(String word){
        return word.toCharArray()[word.length()-1];
    }

    private int[] checkLoser(int[] answer, int n, int i){
        if((i+1) % n == 0){
            answer[0] = n;
            answer[1] = (i+1) / n;
        }else{
            answer[0] = (i+1) % n;
            answer[1] = (i+1) / n + 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] words = new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        System.out.println(new Quest67680().solution(3, words));

//        String[] words = new String[]{"hello", "one", "even", "never", "now", "world", "draw"};
//        System.out.println(new Quest67680().solution(2, words));

    }
}
