package algoTest.kakao210331;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.*;

public class Test1 {
    public  List<String> solution(List<List<String>> arr){
        List<String> answer = new ArrayList<>();
        Map<String, Integer> pointBoard = new HashMap<>();
        int flag = -1;
        for (int j = 0 ; j < arr.get(0).size()-1; j++){
            for(int i =0 ; i < arr.size(); i++){
                if (pointBoard.containsKey(arr.get(i).get(j))){
                    Integer score = pointBoard.get(arr.get(i).get(j));
                    score += (Integer.parseInt(arr.get(i).get(2)) * flag);
                    pointBoard.put(arr.get(i).get(j), score);
                }else{
                    pointBoard.put(arr.get(i).get(j), Integer.parseInt(arr.get(i).get(2)) * flag);
                }
            }
            flag *= -1;
        }

        int min = Integer.MAX_VALUE;
        for(String key : pointBoard.keySet()){
            if( pointBoard.get(key) < 0 ){
                if(min > pointBoard.get(key)){
                    answer.clear();
                    min = pointBoard.get(key);
                    answer.add(key);
                }else if(min == pointBoard.get(key)){
                    answer.add(key);
                }
            }

        }
        if(answer.isEmpty()) {
            answer.add("None");
        }
        Collections.sort(answer);
        return answer;

    }
}
