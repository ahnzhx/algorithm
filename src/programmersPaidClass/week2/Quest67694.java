package programmersPaidClass.week2;

import java.util.*;

public class Quest67694 {
    public int solution(String[][] clothes) {
        int answer = 0;
        Map<String, Integer> combination = new HashMap<>();

        for(int i = 0; i < clothes.length; i++){
            combination.computeIfPresent(clothes[i][1], (key, val) -> val+1 );
            combination.computeIfAbsent(clothes[i][1], v -> 1);
        }
        int keySetSize = combination.keySet().size();
        // TODO. 몇 개씩 뽑을건지 (1 ~ 4)
        for(int i =1 ; i <= keySetSize; i++){
            for (String s : combination.keySet()) {
                answer += combination.get(s);
            }

        }







        return 0;
    }
}
