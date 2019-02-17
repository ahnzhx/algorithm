package CaterpillarMethod;

import java.util.Arrays;

public class CountTriangles {

    //O(N^2)
    public static int solution(int[] A){
        if(A.length < 3)
            return 0;

        Arrays.sort(A);
        int result = 0;
        for(int p = 0; p < A.length-2; p++){
            int q = p+1;
            for(int r = p + 2; r < A.length; r++ ){
                while( q < r && A[p]+ A[q] <= A[r] ){
                    q++;
                }
                result = result + r - q;
            }
        }
        return result;
    }
    public static void main(String []args){
        int a[] = {10, 2, 5, 1, 8, 12};
        System.out.println(solution(a));
    }
}
