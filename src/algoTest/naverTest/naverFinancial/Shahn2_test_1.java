package algoTest.naverTest.naverFinancial;

import java.util.HashMap;
import java.util.Map;

public class Shahn2_test_1 {
    public int solution(String[] A){
        Map<String, Integer> patients = new HashMap<>();
        for(String department: A){
            if(patients.get(department) != null){
                Integer value = patients.get(department) + 1;
                patients.put(department, value);
            }
            patients.putIfAbsent(department, 1);
        }

        return patients.values().stream().mapToInt(v -> v).max().getAsInt();
    }
}
