package divideAndConquer.sorting;

import java.util.Arrays;

public class MaxProductOfThree {


    /**
     * Therefore multiplying the two most negative values
     * by the largest positive value is also a condidate.
     * The largest most positive candidate is the answer.
     * */

    public static int solution2(int A[]){
        Arrays.sort(A);

        int n = A.length;
        int iresult = Math.max(A[0]*A[1]*A[n -1],
                A[n-1] * A[n-2] * A[n-3]);
        return iresult;
    }

    public static void main(String args[]){
        int []A = {-3,-4,-10,-2,9,-7};

        System.out.println(solution2(A));
    }
}
