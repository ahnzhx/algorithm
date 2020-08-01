package programmers.tossTest;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class QuestFive {
    public static void test(String kimTossInput,String leeTossInput){
        int[] kimTossInputArr = Stream.of(kimTossInput.split("")).mapToInt(Integer::parseInt).toArray();
        int[] leeTossInputArr = Stream.of(leeTossInput.split("")).mapToInt(Integer::parseInt).toArray();
        int[] result = new int[kimTossInputArr.length];

        for(int i =0 ; i< kimTossInputArr.length ; i++){

        }

    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String kimTossInput = br.readLine();
        String leeTossInput = br.readLine();
        test(kimTossInput, leeTossInput);
    }
}
