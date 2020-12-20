package testAlgi;

import java.util.HashMap;
import java.util.Map;

public class test1 {
    public String solution(String T){
        char[] tArr = T.toCharArray();
        Map<Character, Integer> tMap = new HashMap<>();
        for(char c : tArr){
            if(tMap.containsKey(c)){
                int val = tMap.get(c);
                tMap.put(c, val+1);
            }
            tMap.putIfAbsent(c, 1);

        }

        StringBuilder sb = new StringBuilder();
        if(tMap.get('S') != null){
            for(int i = 0 ; i < tMap.get('S'); i++){
                sb.append('S');
            }
        }
        if(tMap.get('M') != null){
            for(int i = 0 ; i < tMap.get('M'); i++){
                sb.append('M');
            }

        }

        if(tMap.get('L') != null){
            for(int i = 0 ; i < tMap.get('L'); i++){
                sb.append('L');
            }
        }
        return sb.toString();
    }
}
