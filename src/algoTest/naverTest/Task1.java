package algoTest.naverTest;

public class Task1 {
   static int solution(int[] A, int X) {
       int N = A.length;
       if (N == 0) {
           return -1;
       }
       int l = 0;
       int r = N - 1;
       while (l <= r) {
           int m = (l + r) / 2;
           if (A[m] > X) {
               r = m -1;
           } else if(A[m]<X){
               l = m+1;
           } else return l=m;
       }
       if (A[l] == X) {
           return l;
       }
       return -1;
    }

    public static void main(String[] args) {
        int[]  A = {1,2,5,9,9};
        System.out.println(solution(A, 5));
    }
}
