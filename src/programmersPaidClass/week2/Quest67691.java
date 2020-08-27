package programmersPaidClass.week2;

import java.util.ArrayList;
import java.util.List;

public class Quest67691 {
    public int[] solution(int[] prices) {
        List<Integer> answerList = new ArrayList<>();
        int index = 0;
        while(index < prices.length){
            for(int i = index ; i< prices.length; i++){
                if(prices[index] > prices[i] ){
                    answerList.add(i - index);
                    break;
                }

                if(i == prices.length - 1){
                    answerList.add(prices.length - (index + 1));
                }
            }

            index++;

        }
        return answerList.stream()
                         .mapToInt(Integer::intValue)
                         .toArray();
    }
}
