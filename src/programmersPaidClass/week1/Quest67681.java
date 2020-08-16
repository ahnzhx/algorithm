package programmersPaidClass.week1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Quest67681 {
    public int solution(int[] nums) {
        int answer = 0;
        IntStream sortedNums = Arrays.stream(nums).sorted();
        nums = sortedNums.toArray();
        for(int i = 0 ; i < nums.length - 2 ; i++){
            for(int j =i + 1; j < nums.length - 1; j++){
                for(int k = j + 1; k < nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    int divide = 2;
                    while(sum % divide != 0 ){
                        divide++;
                        if(divide == sum){
                            answer++;
                        }

                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        //System.out.println(new Quest67681().solution(new int[]{1,2,3,4}));
        System.out.println(new Quest67681().solution(new int[]{1,2,7,6,4}));

    }
}
