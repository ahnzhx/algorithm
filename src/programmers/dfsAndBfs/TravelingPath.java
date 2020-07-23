package programmers.dfsAndBfs;

import java.util.ArrayList;
import java.util.List;

/**
 * 아직 못 풀음
 */
public class TravelingPath {
    public List<String> solution(String[][] tickets) {

        List<String> answer = new ArrayList<>();
        boolean[] check = new boolean[tickets.length+1];

        answer.add(tickets[0][0]);
        for(int i =0 ; i<tickets.length +1 ; i++){
            dfs(tickets, i, check, answer);

        }

        return answer;
    }

    boolean[] dfs(String[][] tickets, int start, boolean[] check, List<String> answer){
        check[start] = true;

        for(int j = 0; j < tickets.length; j ++){
            if( tickets[j][0].equals(tickets[start][1])){
                answer.add(tickets[start][1]);
                check = dfs(tickets, j, check, answer);
            }
        }

        return check;
    }

    public static void main(String[] args) {
        String[][] tickets = new String[][]{{"icn", "jfk"},{"hnd", "iad"},{"jfk", "hnd"}};
        System.out.println(new TravelingPath().solution(tickets));
    }
}
