package algoTest.kakao210405;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public int solution(int[][] needs, int r){
        int[] machines = new int[]{0,1,2};
        List<List<Integer>> machinesCombi = new ArrayList<>();
        // 1. 가능한 기계 조합을 찾는다.
        for(int i = 0; i < machines.length; i++){
            for(int j = i+1; j < machines.length; j++){
                List<Integer> combi = new ArrayList<>();
                combi.add(i);
                combi.add(j);
                machinesCombi.add(combi);
            }
        }

        // 2. 1에서 찾은 기계조합으로 만들 수 있는 제품의 개수 세기
        int max = Integer.MIN_VALUE;
        for(List<Integer> machine : machinesCombi){
            int numberOfProduct = 0 ;
            for(int p = 0 ; p < needs.length; p++){
                List<Integer> partList = new ArrayList<>();
                for(int q =0 ; q < needs[p].length; q++){
                    if(needs[p][q] == 1){
                        partList.add(q);
                    }
                }
                if(machine.containsAll(partList)){
                    numberOfProduct ++;
                }
            }
            if(max < numberOfProduct){
                max = numberOfProduct;
            }
        }
        return max;
    }
}
