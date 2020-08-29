package programmers.ebayTest;

import java.util.ArrayList;
import java.util.List;

public class Quest5 {
    public int solution(int N, int[][] simulation_data) {
        int answer = 0;
        List<Integer>[] q = (List<Integer>[]) new ArrayList<>().get(N);
        for(int i =0; i < simulation_data.length; i++){
            int ticketSec = simulation_data[i][0];
            int counselSec = simulation_data[i][1];

        }
        return answer;
    }
}
