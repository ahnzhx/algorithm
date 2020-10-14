package algoTest.RegularTest;

import java.util.HashMap;
import java.util.Iterator;

public class Camouflage {
    //문제: 위장
    public static int solution(String[][] clothes){
        int answer = 1;
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i =0 ; i<clothes.length; i++){
            String key = clothes[i][1];
            if(!hashMap.containsKey(key))
                hashMap.put(key, 1);
            else
                hashMap.put(key, hashMap.get(key)+1);
        }

        Iterator<Integer> it = hashMap.values().iterator();
        while (it.hasNext())
            answer *= it.next().intValue()+1; // 해당 옷을 안입을 경우도 있으므로 각 옷 종류수에 +1


        return answer-1; //옷 전체를 안입을 경우 제외하자
    }

    public static void main(String[] args){
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}};
        String[][] clothes2 = {{"crow_mask","face"},{"blue_sunglasses","face"},{"smoky_makeup","face"}};
        System.out.println(solution(clothes));
    }
}
