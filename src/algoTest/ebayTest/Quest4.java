package algoTest.ebayTest;

import java.util.*;

// 풀었음
public class Quest4 {
    public int solution(int num, int[] cards) {
        List<Integer> answerList = new ArrayList<>();
        int turn = 0;

        while (turn < cards.length){
            int copyNum = num;
            int countCards = 0;
            for(int i = turn; i >= 0 ; i--){
                if(copyNum == 0) break;

                countCards  += copyNum / cards[i];
                copyNum %= cards[i];

                if(copyNum % cards[i] == 0)
                    answerList.add(countCards);

            }
            turn++;
        }
        Collections.sort(answerList);
        return answerList.get(0);
    }
}
