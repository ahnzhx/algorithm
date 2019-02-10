package primeAndCompositeNumbers;

import java.util.ArrayList;

public class Peaks {
    // 100% / O(N*log(log(N)))
    public static int solution(int []A){
        int N = A.length;

        ArrayList<Integer> peaks = new ArrayList<>();
        for(int i = 1; i < N-1; i++){
            if(A[i] > A[i-1] && A[i] > A[i+1]) peaks.add(i);
        }

        for(int size = 1; size <= N; size++){
            if(N % size != 0) continue;
            int find = 0;
            int groups = N/size;
            boolean ok = true;

            for(int peakIdx : peaks){
                if(peakIdx/size > find){
                    ok = false;
                    break;
                }

                if(peakIdx/size == find) find++;
            }
            if(find != groups) ok = false;
            if(ok) return groups;
        }
        return 0;
    }

    public static void main(String []args){
        int a[] = {1,2,3,4,3,4,1,2,3,4,6,2};
        System.out.println(solution(a));
    }
}
