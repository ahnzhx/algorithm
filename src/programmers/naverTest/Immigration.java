package programmers.naverTest;

import java.util.Arrays;

public class Immigration {
    public static long solution(int n, int[] times) {
        long answer = Long.MAX_VALUE;
        long left =0;
        long right =0;
        long mid;

        for(int time : times){
            if(time>right){
                right = time;
            }
        }

        right *= n;

        while(left <= right){
            long done =0;
            mid = (left + right) /2;

            for(int time : times){
                done += mid / time;
            }
            if(done < n){
                // 해당 시간동안 심사를 다 하지 못한 경우
                left = mid +1;
            }else{
                // 시간이 여유있거나 딱 맞는 경우
                if(mid < answer){
                    answer = mid;
                }
                right = mid-1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] times = {7, 10};
        System.out.println(solution(6, times));
    }
}
