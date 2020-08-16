package programmersPaidClass.week1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Quest67682 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; // 행의 길이
        for (int i = 0 ; i< commands.length ; i++){
            int[] extracted = new int[commands[i][1] - commands[i][0] + 1];
            System.arraycopy(array, commands[i][0] - 1,  extracted, 0, commands[i][1] - commands[i][0] + 1);
            IntStream sorted = Arrays.stream(extracted).sorted();
            extracted = sorted.toArray();
            answer[i] = extracted[commands[i][2] - 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,5,2,6,3,7,4};
        // int[][] commands = new int[][]{{2,5,3}, {4,4,1}, {1,7,3}, {2,4,1}};
        int[][] commands = new int[][]{{2,4,1}};
        System.out.println(new Quest67682().solution(array, commands));
    }
}
