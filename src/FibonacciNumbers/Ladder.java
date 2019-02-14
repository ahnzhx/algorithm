package FibonacciNumbers;

public class Ladder {

    // O(L)
    public static int[] solution(int []A, int []B){
        // for a given N rungs, the number of different ways of climbing is the (N+1)th element in the Fibonacci numbers.
        // we know that the result of a number modulo 2^P is the bit under P, so
        // if we first let the number modulo 2^Q(Q > P) and then modulo 2^P, the
        // result is the same.
        int L = A.length;
        int[] fib = new int[L+2];
        int[] result = new int[L];
        fib[1] = 1;
        fib[2] = 2;
        for (int i = 3; i <= L; i++) {
            // make sure the fibonacci number will not exceed the max integer in java 1<<n = 2^n
            fib[i] = (fib[i-1] + fib[i-2]) % (1 << 30);
        }
        for (int i = 0; i < L; i++) {
            result[i] = fib[A[i]] % (1 << B[i]);
        }
        return result;
    }

    public static void main(String []args){
        int a[]={4,4,5,5,1};
        int b[]={3,2,4,3,1};
        System.out.println(solution(a,b));
    }
}
