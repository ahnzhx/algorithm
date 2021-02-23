package algoTest.naverTest.naverFinancial;

import java.util.Arrays;

public class DemoTest {

    public int solution(int[] A) {
        Arrays.sort(A);

        int min = 0;
        for(int value : A){
            if(value -min <= 1){
                min = value;
            }else{
                min = min + 1;
                break;
            }

        }
        if(min == A[A.length-1]) min += 1;
        if(min <= 0) return 1;

        return min;
    }
}
