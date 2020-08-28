package programmersPaidClass.week3;

import java.util.*;

//TODO: 못 풀었음
public class Quest67700 {
    public int solution(int stock, int[] dates, int[] supplies, int k) {
        List<Integer> possibleCaseList = new ArrayList<>();

        while ( true){
            int sumOfStock = stock;
            int answer = 0;
            for(int i =0 ; i< dates.length ; i++){
                if(sumOfStock < k){
                    sumOfStock += supplies[i];
                    answer++;
                }

            }
            if(answer > 0){
                possibleCaseList.add(answer);
            }
            break;
        }
        return 0;
    }
}