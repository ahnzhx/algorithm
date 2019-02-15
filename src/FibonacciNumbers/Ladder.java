package FibonacciNumbers;

public class Ladder {

    // O(L)
    public static int[] solution(int []A, int []B){
        //modulo : 나눗셈의 나머지를 계산하는 수학적 연산
        int L = A.length;
        int fib[] = new int [L+2];
        int result[] = new int [L];
        fib[1] = 1;
        fib[2] = 2;
        for(int i = 3; i<= L ; i++)
            fib[i] = (fib[i-1]+ fib[i-2]) %(1 << 30);


        for(int i =0; i < L ; i++)
            result[i] = (fib[A[i]]) % (1 << B[i]);

        return result;
    }

    public static void main(String []args){
        int a[]={4,4,5,5,1};
        int b[]={3,2,4,3,1};
        System.out.println(solution(a,b));
    }
}
