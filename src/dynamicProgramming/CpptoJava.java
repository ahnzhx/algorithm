package dynamicProgramming;

import java.util.Arrays;

public class CpptoJava {
    int cache[][] = new int[30][30];

    //2차원 배열 cache를 -1로 초기화
    int[][] cacheInit(){
        Arrays.fill(cache,-1);
        return cache;
    }


    int bino2(int n, int r){
        if(r == 0 || n==r) return 1;
        if(cache[n][r] != -1)
            return cache[n][r];
        return cache[n][r] = bino2(n-1, r-1)+bino2(n-1, r);
    }



}
