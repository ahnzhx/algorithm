package CaterpillarMethod;

public class CountDistinctSlices {

    //O(N) 100%
    public static int solution(int M, int[] A){
        int N = A.length;
        int []counters = new int[M+1];
        int head =0;
        int tail =0;
        int result =0;
        while(tail < N){
            while(head < N && counters[A[head]] != 2){
                counters[A[head]]++;
                if(counters[A[head]] == 2)
                    break;
                head++;
            }
            result += head-tail;
            if(result > 1000000000)
                return 1000000000;
            counters[A[tail]] = 0;
            tail++;
        }
        return result;
    }

    public static void main(String []args){
        int a[]={3,4,5,5,2};
        System.out.println(solution(6, a));
    }
}
