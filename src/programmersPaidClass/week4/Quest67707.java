package programmersPaidClass.week4;

import java.util.Arrays;

public class Quest67707 {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] student = new int[n];
        Arrays.fill(student, 1 );

        for(int i : lost) student[i-1] -=1;
        for(int i : reserve) student[i-1] +=1;

        for(int i = 0; i < n; i++){
            if(student[i] <= 1 ){ continue; }

            if(i> 0 && student[i-1] < 1){
                student[i-1] += 1;
                student[i] -= 1;
            }else if(i < n-1 && student[i+1] < 1){
                student[i+1] += 1;
                student[i] -= 1;
            }
        }

        int answer = 0;
        for(int i =0 ; i < n ; i++){ answer += student[i] >= 1 ? 1: 0; }
        return answer;
    }
}
