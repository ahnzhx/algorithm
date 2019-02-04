package divideAndConquer;

import java.util.Arrays;

public class MaxCounters {

    public static int[] solution(int N, int[] A){
        int counters[] = new int[N];
        int base= 0;
        int cMax = 0;
        for(int a: A){
            if(a > N){
                base = cMax;
            }else{
                if(counters[a-1] < base){
                    counters[a-1] = base;
                }
                counters[a-1] ++;
                cMax = Math.max(cMax, counters[a-1]);
            }
        }

        for (int i =0; i < N; i++){
            if(counters[i] < base){
                counters[i] = base;
            }
        }
        return counters;
    }




    public static void main(String []args){
        System.out.println(Arrays.toString(solution(5, new int[] { 3, 4, 4, 6, 1, 4, 4 })));
        System.out.println(Arrays.toString(solution(5, new int[] { 3, 4, 4, 6, 1, 4, 4, 6 })));
        System.out.println(Arrays.toString(solution(1, new int[] { 2, 1, 1, 2, 1 })));
    }
}
