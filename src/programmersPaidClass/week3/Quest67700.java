package programmersPaidClass.week3;

import java.util.*;

//TODO: 못 풀었음
public class Quest67700 {
    public int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        Queue<Integer> factory = new PriorityQueue<>(Collections.reverseOrder());

        int supplyIdx =0;
        for(int i =0 ; i < k; i++){
            if(supplyIdx < dates.length && i == dates[supplyIdx]){
                factory.offer(supplies[supplyIdx]);
                supplyIdx++;
            }
            --stock;
            if(stock == -1){
                stock += factory.poll();
                ++answer;
            }
        }

        return answer;
    }
}