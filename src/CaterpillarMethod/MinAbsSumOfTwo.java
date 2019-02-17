package CaterpillarMethod;

import java.util.Arrays;

public class MinAbsSumOfTwo {

    //O(N*log(N))
    public static int solution(int[] A){
        Arrays.sort(A);
        int j = A.length-1;
        int result = Integer.MAX_VALUE;
        for(final int value: A){
            int best = Math.abs(value+A[j]);
            while(j > 0 && Math.abs(value+A[j-1])<= best){
                j--;
                best = Math.abs(value + A[j]);
            }
            if(result > best)
                result = best;
        }
        return result;
    }
    public static void main(String []args){
        int a[]={-8, 4,5,-10, 3};
        System.out.println(solution(a));
    }
}
