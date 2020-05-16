package programmers.naverTest;

import java.util.LinkedList;
import java.util.List;

public class Task3 {
    public static boolean solution(int[] A) {

        int answer =0;
        boolean alreadyCalculated[] = new boolean[A.length];
        while(true){
            for(int i =0 ; i< A.length ; i++){
                for(int j = i+1 ; j < A.length; j++){
                    if(!alreadyCalculated[i] && !alreadyCalculated[j] && (A[i]+A[j]) % 2 != 0 ){
                        answer ++;
                        alreadyCalculated[i] = alreadyCalculated[j] = true;
                        break;
                    }
                }
            }
            break;
        }
        if(answer == (A.length/2))
            return true;
        else return false;
    }

    public static void main(String[] args) {
        int[] A = {2,7,4,6,3,1};
        System.out.println(solution(A));
    }
}
