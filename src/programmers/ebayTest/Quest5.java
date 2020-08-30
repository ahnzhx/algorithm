package programmers.ebayTest;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.Predicate;

public class Quest5 {
    public int solution(int N, int[][] simulation_data) {
        int answer = 0;
        Queue<Integer> q = new PriorityQueue<>();
        int totalRunningTime = 0;

        for(int i =0; i < simulation_data.length; i++){
            int waitAndCounsel = simulation_data[i][0] + simulation_data[i][1];
            if(q.size() < N){
                q.add(waitAndCounsel);
                if(totalRunningTime < waitAndCounsel) totalRunningTime = waitAndCounsel;
                continue;
            }

            int startToWait =  simulation_data[i][0];
            Predicate<Integer> isQualified = currentTime -> currentTime <= startToWait;
            boolean isRemoved = q.removeIf(isQualified);

            int waitingTime = 0;
            if(!isRemoved){
                waitingTime = q.peek() - startToWait;
            }

            if(waitAndCounsel > totalRunningTime && !q.isEmpty()){
                totalRunningTime = q.poll() + simulation_data[i][1];
                q.add(totalRunningTime);
            }else{
                q.add(waitAndCounsel + waitingTime);
            }
            answer += waitingTime;

        }
        return answer;
    }
}
