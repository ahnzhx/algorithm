package programmersPaidClass.week1;

public class Quest67681 {

    public int solution(int[] nums) {
        int answer = 0;

        for(int i = 0 ; i < nums.length - 2 ; i++){
            for(int j =i + 1; j < nums.length - 1; j++){
                for(int k = j + 1; k < nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    if( isPrime(sum))
                        answer++;
                }
            }
        }
        return answer;
    }

    private boolean isPrime(int sum){
        int divide = 2;
        while(sum % divide != 0 ){
            divide++;
            if(divide == sum)
                return true;
        }
        return false;
    }
}
