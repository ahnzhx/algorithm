package maximumSliceProblem;

public class MaxProfit {
    // 33%
    public static int solution(int[] A){
        int maxProfit = 0;
        int p =0 , q= 10000000;
        int n = A.length;

        for(int i =1 ; i< n ; i++){
            p = Math.max(p, A[i]);
            q = Math.min(q, A[i]);
        }
        maxProfit = p-q;
        System.out.println(maxProfit);
        if (maxProfit < 0) return 0;
        else return maxProfit;
    }
    // O(N), 100%
    public static int solution2 (int[] A){
        if (A.length < 2) {
            return 0;
        }
        int buy = A[0];
        int profit = 0;
        for (int idx = 1; idx < A.length; ++idx) {
            //한번 입력받고 더 이상 값을 변경할 필요가 없는 경우 final
            final int value = A[idx];
            profit = Math.max(profit, value - buy);
            buy = Math.min(buy, value);
        }
        return profit;
    }

    public static void main(String [] args){
        int a[] = {23171, 21011, 21123, 21366, 21013, 21367};
        System.out.println(solution(a));
    }
}
