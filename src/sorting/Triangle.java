package sorting;

import java.util.Arrays;

public class Triangle {
    //O(N*long(N))
    public static int solution(int []A) {
        Arrays.sort(A); //{1, 2, 5, 8, 10, 20}

        for(int i =0; i< A.length-2; i++){
            if(A[i] < 0) continue;
            if((long)A[i]+A[i+1]> A[i+2])return 1;
        }
        return 0;
    }

    public static void main(String args[]){
        int []A = {10, 2, 5, 1, 8, 20};
        int []B = {10, 50, 5, 1};

        System.out.println(solution(A));
        System.out.println(solution(B));

    }
    
}
