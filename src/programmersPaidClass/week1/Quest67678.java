package programmersPaidClass.week1;

import javax.jnlp.IntegrationService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Quest67678 {
    public int[] solution(int[] answers) {
        List<int[]> studentsAnswer = Arrays.asList(new int[]{1,2,3,4,5}, new int[]{2,1,2,3,2,4,2,5}, new int[]{3,3,1,1,2,2,4,4,5,5});
        List<Integer> scoreBoard = new ArrayList<>();

        // 1. 학생별로 점수를 계산한다.
        for(int[] studentAnswer : studentsAnswer){
            int[] answerSheet = new int[answers.length];
            int circuit = answers.length / studentAnswer.length;
            int al = 0;

            for(int c = 0; c <= circuit; c++){
                for(int sa = 0; sa< studentAnswer.length; sa++){
                    if(al == answers.length){
                        break;
                    }
                    answerSheet[al] = studentAnswer[sa];
                    al++;
                }
            }
            int score =0;
            for(int i = 0; i < answers.length ; i++){
                if( answers[i] == answerSheet[i] )
                   score++;
            }
            scoreBoard.add(score);
        }

        // 2.최대 점수를 찾는다.
        int max  = scoreBoard.stream().max(Integer::compareTo).get();

        // 3.최대 점수와 같은 학생을 모은다.
        List<Integer> answerList = new ArrayList<>();
        for(int j = 0 ; j < scoreBoard.size() ; j ++){
            if(scoreBoard.get(j) == max){
                answerList.add(j+1);
            }
        }

        // 4.그 학생들의 번호를 반환한다.
        return answerList.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(new Quest67678().solution(new int[]{1,2,3,4,5,3,2,4,3,4,1,2,3,1,2,3,4,5,2,1,2,2,3,2}));
        System.out.println(new Quest67678().solution(new int[]{1,2,3,4,5}));
        System.out.println(new Quest67678().solution(new int[]{1,3,2,4,2}));
    }
}
