package programmersPaidClass.week1;

import javax.jnlp.IntegrationService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quest67678 {
    public int[] solution(int[] answers) {
        List<int[]> studentsAnswer = Arrays.asList(new int[]{1,2,3,4,5}, new int[]{2,1,2,3,2,4,2,5}, new int[]{3,3,1,1,2,2,4,4,5,5});
        List<int[]> submittedStudentsAnswer = new ArrayList<>();

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

            submittedStudentsAnswer.add(answerSheet);
        }

        List<Integer> studentsWhoGotHighestScore = new ArrayList<>();

        for(int j =0 ; j < submittedStudentsAnswer.size() ; j++){
            int score = 0;
            for(int i = 0; i< answers.length; i++){
                if(answers[i] == submittedStudentsAnswer.get(j)[i]){
                    score ++;
                }
            }
            studentsWhoGotHighestScore.add(score);
        }


        int max  = studentsWhoGotHighestScore.stream().max(Integer::compareTo).get();
        studentsWhoGotHighestScore.removeIf(score -> (score != max));
        studentsWhoGotHighestScore.stream().sorted();

        int answer[] = new int[studentsWhoGotHighestScore.size()];
        for(int p =0; p < studentsWhoGotHighestScore.size() ; p++){
            answer[p] = p+1;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new Quest67678().solution(new int[]{1,2,3,4,5,3,2,4,3,4,1,2,3,1,2,3,4,5,2,1,2,2,3,2}));
        System.out.println(new Quest67678().solution(new int[]{1,2,3,4,5}));
        System.out.println(new Quest67678().solution(new int[]{1,3,2,4,2}));
    }
}
