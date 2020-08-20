package programmersPaidClass.week1;

public class Quest67681 {
    public Quest67681() {
    }

    public int solution(int[] nums) {
        int answer = 0;

        for(int i = 0 ; i < nums.length - 2 ; i++){
            for(int j =i + 1; j < nums.length - 1; j++){
                for(int k = j + 1; k < nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    int divide = 2;
                    answer = isPrime(sum, divide, answer);
                }
            }
        }
        return answer;
    }

    private int isPrime(int sum, int divide, int answer){
        while(sum % divide != 0 ){
            divide++;
            if(divide == sum) answer++;
        }
        return answer;
    }
}
