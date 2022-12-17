package leetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TextJustification {
    /**
     * todo 1.각 글자수 센다.
     * todo 2.maxWidth 에 맞게 나눈다.
      */

    public static List<String> fullJustify(String[] words, int maxWidth) {
        int sumOfWords=0;
        int countOfWords = 0;
        List<String> ret = new ArrayList<>();
        Queue<String> temp = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int tempMaxWidth = maxWidth;

        for(String word: words){
            if(validation(maxWidth, sumOfWords, countOfWords, word)){
                int mod =0;
                while(temp.peek() != null){
                    if(maxWidth > 0){
                        countOfWords -= 1;
                        if(countOfWords == 0){
                            countOfWords = 1;
                        }

                        mod = (int) Math.max(Math.ceil((maxWidth - sumOfWords)/ (double)countOfWords), 0);
                    }
                    process(mod, temp.poll(), sb);

                    maxWidth -= mod;
                }

                ret.add(sb.toString());
                sb = new StringBuilder();
                temp.add(word);
                maxWidth = tempMaxWidth;
                sumOfWords = word.length();
                countOfWords =1;
            }else{
                sumOfWords += word.length();
                temp.add(word);
                countOfWords++;
            }
        }

        if(temp.size()>0){
            while (temp.peek() != null){
                sb.append(temp.poll());
                if(temp.size() >0){
                    sb.append(" ");
                }

            }
            int sbLength = sb.length();
            for(int i =0; i < maxWidth-sbLength; i++){
                sb.append(" ");
            }

        }

        ret.add(sb.toString());


        return ret;
    }

    public static void process(int mod, String tempWord, StringBuilder sb){
        sb.append(tempWord);
        sb.append(" ".repeat(Math.max(0, mod)));
    }

    public static boolean validation(int maxWidth, int sumOfWords, int countOfWords, String word){
        if(countOfWords <= 0){
            countOfWords = 1;
            if(maxWidth-word.length() == 0) return false;
        }
        return (maxWidth - sumOfWords - word.length()) / (countOfWords) <= 0;
    }

    public static void main(String[] args) {
//        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
//        String[] words = {"example", "of", "text", "justification."};
//        String[] words = {"What","must","be","acknowledgment","shall","be"};
//        String[] words = {"acknowledgment","shall","be"};
//        String[] words = {"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"};
//        String[] words = {"everything","else","we","do"};
//        String[] words = {"The","important","thing","is","not","to","stop","questioning.","Curiosity","has","its","own","reason","for","existing."};
        String[] words = {"Listen","to","many,","speak","to","a","few."};
        int maxWidth = 6;
        System.out.println(fullJustify(words, maxWidth));
    }
}
