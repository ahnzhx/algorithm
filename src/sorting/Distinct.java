package sorting;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Distinct {


    public static int solution2(int []A) {
        if(A.length == 0){
            return 0;
        }

        Arrays.sort(A);
        int count =1;
        int prev = A[0];

        for(int i =1; i < A.length; i++){
            if(A[i] != prev){
                count++;
                prev = A[i];
            }
        }
        return count;
    }
    public static void main(String []args){
        int []A = {2,1,1,2,3,1};
        System.out.println(solution2(A));
    }
}
