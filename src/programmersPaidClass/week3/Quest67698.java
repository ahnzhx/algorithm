package programmersPaidClass.week3;

import java.util.PriorityQueue;
import java.util.Queue;

public class Quest67698 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> scovilleQueue = new PriorityQueue<>();
        for(int scv : scoville){
            scovilleQueue.add(scv);
        }

        while(scovilleQueue.peek() < K) {
            if(scovilleQueue.size()< 2) return -1;

            scovilleQueue.add(scovilleQueue.poll() + scovilleQueue.poll() * 2);
            answer++;
        }
        return answer;
    }
}
