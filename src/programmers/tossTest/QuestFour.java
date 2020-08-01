package programmers.tossTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class QuestFour {
    public static void test(String input){
        String[] inputArr = input.split(" ");
        LinkedList<String> result = new LinkedList<>();

        result.add(inputArr[0]);

        System.out.printf("%s", result.get(0));
        System.out.println();

        for(int i =1 ; i< inputArr.length; i++){
            if(result.getFirst().equals(inputArr[i])){
                for(String str : result){
                    System.out.printf("%s ", str);
                }
                System.out.println();
            }else{
                if(result.contains(inputArr[i])){
                    result.remove(inputArr[i]);
                }
                result.addFirst(inputArr[i]);
                if(result.size() > 5){
                    result.removeLast();

                }
                for(String str : result){
                    System.out.printf("%s ", str);
                }
                System.out.println();

            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
        String input = "우리 우리 우리 하나 우리 국민 삼성 농협 농협 농협 국민 저축";
        test(input);
    }
}
