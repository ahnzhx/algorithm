package maximumSliceProblem;

public class MaxProfit {
    public static int solution(int[] A){
        int maxProfit = 0;
        int p , q;
        int n = A.length;

        for(int i =n -1 ; i>= 0 ; i--){
            p = A[i];
            q = A[n - 1 - i];
            System.out.println("p :"+p);
            System.out.println("q :"+q);
            System.out.println("p-q = "+(p-q));
            System.out.println("maxProfit = "+maxProfit);
            maxProfit = Math.max(maxProfit, p-q);

        }
        if (maxProfit < 0) return 0;
        else return maxProfit;
    }
    public static void main(String [] args){
        int a[] = {23171, 21011, 21123, 21366, 21013, 21367};
        System.out.println(solution(a));
    }
}
