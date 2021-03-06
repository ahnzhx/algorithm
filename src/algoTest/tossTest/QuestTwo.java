package algoTest.tossTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class QuestTwo {

    public static boolean test(String input){
        int[] inputArr = Stream.of(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        if(inputArr.length <6){
            return false;
        }
        for(int i = 0 ; i< inputArr.length-1; i++){
            if(inputArr[i] - inputArr[i+1] >= 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        boolean result = test(input);
        System.out.println("Hello Goorm! Your input is " + input);
        System.out.println(result);
    }
}
