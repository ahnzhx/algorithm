package divideAndConquer.prefixSums;

public class MinAvgTwoSlice {
/**
* 결론적으로 2가지 케이스만 고려하면 된다. slice가 2개 또는 3개인 경우이다.
 * 평균의 성질로 부분집합의 평균은 가장 작은 인자보다 항상 크다.
 * 또한, 평균들의 평균은 각 인자들의 평균과 같다.
 * 위 두가지 성질을 생각하였을 때, 인자의 수가 4개 이상인 것은 고려할 필요가 없다.
 * 가장 작은 평균을 가지는 부분집합은 가장 작은 숫자를 포함한 2개 또는 3개의 인자만
 * 생각하면 된다. 3개의 인자를 고려하는 것은 2개의 부분집합으로는
 * 3개의 부분집합을 구할 수 없기 때문이다. 가령, (1,5,2)가 있을 때,
 * (2,6,1) = 3 이고 (2, 6)= 4, (6,1)= 3.5 일때, (4, 3.5) = 3.75가 됨으로
 * 3개의 경우는 따로 생각해야 한다.
 *
 * 시간복잡도: O(n)
 *
 * (** 2로 나누는 경우와 2.0으로 나누는 경우 답이 다르게 나오므로 주의!)
* */
    public static int solution(int[] A){
        int n = A.length;
        double min = 10001;
        int min_idx = 0;
        double avg = 0;

        for(int i =0 ; i < n ; i++){
            if(i + 1< n){
                avg = (A[i] + A[i+1])/2.0;
                if(avg < min){
                    min = avg;
                    min_idx = i;
                }
            }
            if(i+2 < n){
                avg = (A[i] + A[i+1] + A[i+2])/3.0;
                if(avg < min){
                    min = avg;
                    min_idx = i;
                }

            }
        }
        return min_idx;
    }

    public static void main(String []args){
        int []A = {4,2,2,5,1,5,8};
        System.out.println(solution(A));
    }
}
