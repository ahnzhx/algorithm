package divideAndConquer.prefixSums;

public class PassingCars {
    //50% Timeout error
    public static int solution(int []A){
        int count = 0;
        for(int i =0 ; i< A.length ; i++){
            if(A[i] == 0){
                for (int j = i+1; j<A.length; j++){
                    if(A[j] == 1){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    //100% answer 어려워
    public static int answer_solution(int []A){
        int countOfZeros =0, count =0;
        for (int i =0; i<A.length; i++){
            if(A[i] == 0) countOfZeros++;
            if(A[i] == 1) count += countOfZeros;
            if(count > 1000000000) return -1;
        }

        return count;
    }

    public static void main(String []args){
        int []A = {0,1,0,1,1};
        System.out.println(solution(A));
    }
}
