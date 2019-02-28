package programmers.CodingTest;

import java.util.HashMap;

public class Quest2 {

    //못품
    public static int solution(int[] people, int [] tshirts){
        int answer = 0;
        HashMap<Integer, Integer> tshirtMap = new HashMap<>(), peopleMap = new HashMap<>();

        for(int i = 0; i< tshirts.length; i++){
            Integer key = tshirts[i];
            if (!tshirtMap.containsKey(key))
                tshirtMap.put(key, 1);
            else
                tshirtMap.put(key, tshirtMap.get(key)+1);
        }

        for(int i = 0 ; i<people.length; i++){
            Integer key = people[i];
            if(!peopleMap.containsKey(key))
                peopleMap.put(key, 1);
            else
                peopleMap.put(key, peopleMap.get(key)+1);
        }


        return answer;
    }

    public static void main(String []args){
        int []p = {1, 2, 3};
        int []ts = {1, 1};
        System.out.println(solution(p, ts));
    }

}
