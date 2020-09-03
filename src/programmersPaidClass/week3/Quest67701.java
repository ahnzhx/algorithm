package programmersPaidClass.week3;

import java.util.*;

public class Quest67701 {
    public int solution(int[] numbers, int target) {
        Map<Integer, List<Integer>> possibleAnswer = new HashMap<>();

        List<Integer> firstList = new ArrayList<>();
        firstList.add(-numbers[0]);
        firstList.add(numbers[0]);
        possibleAnswer.put(0, firstList);

        boolean b = true;
        for(int i = 1 ; i < numbers.length; i++){
            List<Integer> list = possibleAnswer.get(i - 1);
            List<Integer> newList = new ArrayList<>();
            int[] operation = new int[]{-numbers[i], numbers[i]};
            for(int j = 0 ; j < list.size() ; j++ ){
                newList.add( list.get(j) + operation[boolToInt(b)]);
                newList.add( list.get(j) + operation[boolToInt(!b)]);
            }


            possibleAnswer.put(i, newList);
        }

        return (int) possibleAnswer.get(numbers.length - 1).stream().filter(v -> v == target).count();
    }
    public int boolToInt(boolean b) {
        return b ? 1 : 0;
    }
}
