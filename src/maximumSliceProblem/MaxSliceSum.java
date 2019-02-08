package maximumSliceProblem;

public class MaxSliceSum {
    public static int solution(int[] A){
        // initial setting A[0]
        int maxEndingPrevious = A[0];
        int maxEndingHere = A[0];
        int maxSoFar = A[0];

        // note: for i=0, it will return A[0] (also for "one element" cases)

        for(int i = 1; i < A.length; i++){
            maxEndingHere = Math.max(A[i], maxEndingPrevious + A[i]); // <--- key point~!!
            maxEndingPrevious = maxEndingHere;
            maxSoFar = Math.max(maxSoFar, maxEndingHere); // update the max (be careful)
        }

        return maxSoFar; // can be used for "all negative" cases
    }
    public static void main(String []args){
        int [] a ={3, 2, -6, 4, 0};
        System.out.println(solution(a));
    }
}
