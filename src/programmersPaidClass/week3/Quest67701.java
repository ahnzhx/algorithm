package programmersPaidClass.week3;

import java.util.Arrays;

public class Quest67701 {
    public int solution(int[] numbers, int target) {
        double colSize = Math.pow(2, numbers.length);
        int[][] allCombination = new int[numbers.length][(int)colSize];

        allCombination[0][0] = -numbers[0];
        allCombination[0][1] = numbers[0];
        for(int i = 1 ; i < numbers.length; i++){
            for(int j = 0; j < Math.pow(2, i+1); j += 2){
                allCombination[i][j] = allCombination[i-1][j/2] - numbers[i];
                allCombination[i][j+1] = allCombination[i-1][j/2] + numbers[i];
            }

        }

        return (int) Arrays.stream(allCombination[numbers.length-1]).filter(v -> v == target).count();
    }
}
