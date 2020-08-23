package programmersPaidClass.week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Quest67692 {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answerList = new ArrayList<>();
        List<Integer> daysList = new ArrayList<>();
        int days = 1;
        for(int i = 0 ; i< progresses.length; i++){
            while(progresses[i] + speeds[i] * days < 100){
                days++;
            }
            daysList.add(days);
            days = 1;
        }

        int index =0; int k = index;
        while(index < daysList.size()){
            if(k == daysList.size()){
                answerList.add(k - index);
                break;
            }

            if(daysList.get(index) < daysList.get(k)){
                answerList.add(k-index);
                index = k;
            }

            k++;
        }

        return answerList.stream()
                        .filter(Objects::nonNull)
                        .mapToInt(Integer::intValue)
                        .toArray();
    }
}
