package algoTest.naverTest.naverFinancial;

import java.util.HashMap;
import java.util.Map;

public class Shahn2_test_3 {

    boolean[] visited = new boolean[4];
    int[] output = new int[4];
    static int count = 0;
    Map<Integer, Integer> times = new HashMap<>();

    public int solution(int A, int B, int C, int D){
        int[] numArr = new int[]{A, B, C, D};

        permutation(numArr, visited, output, 0, 4, 4);

        return count;
    }

    public static void permutation(int[] numArr, boolean[] visited, int[] output, int depth, int n, int r){
        if(depth == r){
            int j = 0;
            int hour = (output[j] *10)+ output[j+1];
            if(hour < 24){
                int minute = (output[2]*10) + output[j+3];
                if(minute < 60){
                    count += 1;
                }
            }
            return ;
        }

        for(int i =0 ; i < n; i++){
            if(!visited[i]){
                visited[i] = true;
                output[depth] = numArr[i];
                permutation(numArr, visited, output, depth+1, n, r);
                visited[i] = false;
            }
        }
    }
}
