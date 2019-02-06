package leader;

import java.util.HashMap;

public class Dominator {
    public static int solution(int[] A){
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i : A){
            if (hashMap.containsKey(i)){
                int count = hashMap.get(i);
                count++;
                hashMap.put(i, count);
            }
        }

        return 0;
    }

    public static void main(String []args){
        int [] a = {3,4,3,2,3,-1,3,3};
        System.out.println(solution(a));
    }
}
