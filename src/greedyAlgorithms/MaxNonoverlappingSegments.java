package greedyAlgorithms;

public class MaxNonoverlappingSegments {

    //O(N)
    public static int solution(int[] A, int[] B){
        int result = 0;
        int previous = -1;
        for(int i = 0 ; i<A.length ; i++){
            if(A[i] > previous){
                result++;
                previous = B[i];
            }
        }
        return result;
    }

    public static void main(String []args){
        int a[] = {1,3,7,9,9};
        int b[] = {5,6,8,9,10};
        System.out.println(solution(a, b));
    }
}
