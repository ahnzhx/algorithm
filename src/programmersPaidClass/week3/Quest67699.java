package programmersPaidClass.week3;

public class Quest67699 {
    public int solution(int n, int[][] computers) {
        int answer = 0 ;
        int startComputer = 0;
        int endComputer = 0;
        while(startComputer < n){
            startComputer = checkNextComputer(startComputer, endComputer, computers, n);
            answer ++;
        }
        return answer;
    }

    // TODO: 재귀 어떻게 (1,2) 에서 끝내지 ?
    private int checkNextComputer(int startComputer, int endComputer, int[][] computers, int n){
        if(endComputer < n){
            if(computers[startComputer][endComputer] == 1){
                checkNextComputer(endComputer, endComputer+1, computers, n);
            }
        }
        return startComputer;
    }
}
