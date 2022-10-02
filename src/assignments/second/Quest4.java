package assignments.second;

import java.util.ArrayList;
import java.util.List;

/**
 * 조건:
 * 최대로 뽑을 수 있는 숫자 4개
 * 중복으로 숫자 뽑을 수 있음
 *
 *
 */
public class Quest4 {

    static List<List<Integer>> ret = new ArrayList<>();
    static List<String> answer = new ArrayList<>();
    public static List<String> combinationSum(int[] X, int[] Y){

        permutation(X, Y, 0,0, 0, new ArrayList<>(), false);
        trimmingAnswer(ret);
        return answer;
    }

    public static void permutation(int[] X, int[] Y, int curr_idx, int curr_sum_X, int curr_sum_Y, List<Integer> curr_arr, boolean flag){
        if(curr_sum_X == curr_sum_Y && flag){
            List<Integer> answerList = new ArrayList<>();
            answerList.addAll(curr_arr);
            ret.add(answerList);
        }else if(curr_sum_X < X[curr_idx] * X.length){
            for (int i = curr_idx; i < X.length; i++) {
                curr_arr.add(i+1);
                permutation(X, Y, i, curr_sum_X + X[i],curr_sum_Y + Y[i], curr_arr, true);
                curr_arr.remove(curr_arr.size()-1);
            }
        }
    }

    public static void trimmingAnswer(List<List<Integer>> ret){
        for(List<Integer> candidate :ret){
            int count = 1;
            int compareNum = candidate.get(0);
            StringBuilder sb = new StringBuilder();
            for(int i =1 ; i < candidate.size(); i++){
                if(compareNum == candidate.get(i)){
                    count ++;
                }else{

                    if(count >1){
                        sb.append("("+count+")"+ compareNum + ",");
                    }else{
                        sb.append(compareNum + ",");
                    }

                    if(candidate.size()-1 == i){
                        sb.append(candidate.get(i));
                    }
                    compareNum = candidate.get(i);
                    count = 1;

                }
                if(candidate.size()-1 == i && count > 1){
                    sb.append("("+count+")"+ compareNum);
                }
            }

            answer.add(sb.toString());
        }
    }

    public static void main(String[] args) {
        int[] X = {1,2,7,9,5};
        int[] Y = {2,1,5,6,7};

        System.out.println(combinationSum(X, Y));
    }

}
