package programmersPaidClass.week1;

import java.util.List;

public class Student {
    private int[] answerSheet;

    // 학생 점수 계산하기
    public int calculateScore(int[] answers, int[] studentAnswer){
        int answersLength = answers.length;
        answerSheet = new int[answersLength];
        int circuit = answersLength / studentAnswer.length;
        int al = 0;

        for(int c = 0; c <= circuit; c++){
            for(int sa = 0; sa< studentAnswer.length; sa++){
                if(al == answersLength){
                    break;
                }
                answerSheet[al] = studentAnswer[sa];
                al++;
            }
        }
        int score =0;
        for(int i = 0; i < answersLength ; i++){
            if( answers[i] == answerSheet[i] )
                score++;
        }
        return score;
    }
    public List<Integer> compareWithHighestScore(List<Integer> scoreBoard, List<Integer> answerList, int max){
        for(int j = 0 ; j < scoreBoard.size() ; j ++){
            if(scoreBoard.get(j) == max){
                answerList.add(j+1);
            }
        }
        return answerList;
    }
}
