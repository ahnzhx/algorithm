package divideAndConquer;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    //내꺼 -> 정답률 18%
    public static int solution(int X, int[] A){
        for (int i =0; i<A.length ; i++){
            if( A[i] == X) return i;
        }
        return -1;
    }

    //stackOverflow
    public static int sofSolution(int X, int[] A){
        Set<Integer> values = new HashSet<>();
        for(int i =0; i<A.length ; i++){
            if(values.add(A[i])) X--;
            if(X == 0) return i;
        }
        return -1;
    }


    public static void main(String []args){
        int x = 5;
        int[] a = {1, 3, 5, 4, 2, 3, 1, 4};
        System.out.println(sofSolution(x, a));
    }
}
