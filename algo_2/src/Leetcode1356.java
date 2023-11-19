import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Leetcode1356 {
    public int[] sortByBits(int[] arr) {
        int[] ret = new int[arr.length];
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();

        for(int element: arr){
            String binElement = Integer.toBinaryString(element);
            int cnt =0;

            for(int i : binElement.toCharArray()){
                if(i == 49) cnt++;
            }

            PriorityQueue<Integer> pq = map.getOrDefault(cnt, new PriorityQueue<>());
            pq.add(element);
            map.put(cnt, pq);

        }

        int index =0;
        int key = 0;

        while(!map.isEmpty()){
            if(map.get(key) != null){
                while(!map.get(key).isEmpty()){
                    ret[index] = map.get(key).poll();
                    index++;
                }
            }
            map.remove(key);
            key++;
        }

        return ret;
    }
}
