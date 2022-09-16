package leetCode.backTracking;

import java.util.*;

public class CombiOfPhoneNum {
    // https://leetcode.com/problems/letter-combinations-of-a-phone-number/

    static Map<Character, List<Character>> phone = new HashMap<>();
    static List<String> answers = new ArrayList<>();
    public static void getLetter(){
        char ascii = 96;
        for(int i = 2; i <= 9; i++){
            if(i == 7 || i == 9){
                phone.put((char)(i+'0'), new ArrayList<>(Arrays.asList(++ascii,++ascii, ++ascii,++ascii)));
            }else{
                phone.put((char)(i+'0'), new ArrayList<>(Arrays.asList(++ascii,++ascii, ++ascii)));
            }
        }

    }
    public static List<String> letterCombinations(String digits) {
        getLetter();

        if(digits.length() > 0){
            for(char alphabet: phone.get(digits.charAt(0))){
                answers.add(Character.toString(alphabet));
            }

            for(int i =1; i <digits.length(); i++){
               answers = bt(i, answers, digits);
            }
        }
        return answers;
    }

    public static List<String> bt( int i, List<String> answers, String digits){
        List<String> temps = new ArrayList<>();
        if(digits.length() > i){
            for(String alphabet: answers){
                for(int j = 0; j < phone.get(digits.charAt(i)).size(); j++){
                    temps.add(alphabet + phone.get(digits.charAt(i)).get(j));
                }
            }
            bt( i+1, temps, digits);
        }
        return temps;
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("2"));
    }
}
