package algoTest.naverTest.naverFinancial;

import java.util.Arrays;

public class Jgha_test_1 {
    public int solution(int[] P, int[] S){
        int sumOfP = 0 ;
        for(int pValue : P){
            sumOfP += pValue;
        }

        // S sort
        Arrays.sort(S);

        int i = S.length-1;
        while(sumOfP > 0){
            sumOfP -= S[i];
            i--;
        }

        return S.length-i-1;
    }
}
