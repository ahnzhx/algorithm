package programmersPaidClass.week2;


import java.util.HashMap;
import java.util.Map;

public class Quest67694 {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> combination = new HashMap<>();

        for(int i = 0; i < clothes.length; i++){
            combination.put(clothes[i][1], combination.getOrDefault(clothes[i][1], 0) + 1);
        }

        for (String s : combination.keySet()) {
            answer *= combination.get(s) + 1;
        }

        return answer - 1;
    }
}
