package programmersPaidClass.week3;

import java.util.Stack;

public class Quest67699 {
    public int solution(int n, int[][] computers) {
        int answer = 0 ;
        boolean[] visited = new boolean[computers.length];
        Stack<Integer> location = new Stack<>();
        for(int i = 0 ; i < computers.length; i++){
            if(visited[i]) continue;
            checkNextComputer(i, computers, visited, location);
            answer += 1;
        }
        return answer;
    }

    private void checkNextComputer(int startComputer, int[][] computers, boolean[] visited, Stack<Integer> location){
        visited[startComputer] = true;
        location.push(startComputer);
        while(!location.isEmpty()){
            int c = location.pop();
            for(int j =0; j < computers[0].length ; j++){
                if(!visited[j] && computers[c][j] == 1 && c != j){
                    visited[j] = true;
                    location.push(j);
                }
            }
        }



    }
}
