package capitalOne;


import java.util.*;

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

        Map<Double, List<Integer>> answers = new HashMap<>();
        for(int i =0 ; i < meanList.size(); i++){
            if(answers.get(meanList.get(i)) != null){
                answers.get(meanList.get(i)).add(i);
            }else{
                List<Integer> temps = new ArrayList<>();
                temps.add(i);
                answers.put(meanList.get(i), temps);
            }


        }
        int maxLength = Integer.MIN_VALUE;
        for(List list : answers.values()){
            if(maxLength < list.size()){
                maxLength = list.size();
            }
        }
        int[][] ret = new int[answers.size()][maxLength];

        for(int i =0 ; i < meanList.size(); i++){
            for(int j =0; j < answers.get(meanList.get(i)).size(); j++){
                ret[i][j] = answers.get(meanList.get(i)).get(j);
            }

        }

        return new int[2][0];
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
