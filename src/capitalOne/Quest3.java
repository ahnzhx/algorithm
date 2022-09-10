package capitalOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quest3 {
    public static int[][] solution(int[][] a) {
        List<Double> meanList = new ArrayList<>();
        for(int i = 0; i < a.length; i++){
            double sum = 0;
            for(int j = 0 ; j < a[i].length; j++){
                sum += a[i][j];
            }
            double mean = sum/a[i].length;
            meanList.add(mean);
        }

        int[][] answer = new int[a.length][a[0].length];
        List<Integer> answerList = new ArrayList<>();
        for(int i =0 ; i < meanList.size(); i++){
            if(!answerList.get(i).equals(meanList.get(i))  ){
                answerList.add(i);

            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] a = {{3, 3, 4, 2},
                {4, 4},
                {4, 0, 3, 3},
                {2, 3},
                {3, 3, 3}};
        solution(a);
    }
}
