package programmers.ebayTest;

import java.util.*;
// TODO: DFS 로?
public class Quest4 {
    public int solution(int num, int[] cards) {
        List<Integer> answerList = new ArrayList<>();
        int turn = 0;

        while (turn < cards.length){
            int copyNum = num;
            int countCards = 0;
            for(int i = turn; i >= turn ; i--){
                if(copyNum % cards[i] == 0){
                    countCards  += copyNum / cards[i];
                    copyNum %= cards[i];
                    answerList.add(countCards);
                }else{
                    countCards  += copyNum / cards[i];
                    copyNum %= cards[i];
                }
            }
            turn++;
        }
        Collections.sort(answerList);
        return answerList.get(0);
    }
}
