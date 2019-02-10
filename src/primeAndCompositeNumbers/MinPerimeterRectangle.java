package primeAndCompositeNumbers;

public class MinPerimeterRectangle {
    // 내가 푼거!! 100% !!!! O(sqrt(N))
    public static int solution(int N){
        final int sqrtN = (int) Math.sqrt(N);
        int a = 0, b= 0;
        int minPerimeter = Integer.MAX_VALUE;
        for(int i = 1; i<=sqrtN ; i++){
            if(N%i ==0){
                a =i;
                b= N/i;
                minPerimeter = Math.min( minPerimeter, 2*(a+b));
            }
        }
        return minPerimeter;
    }

    public static void main(String []args){
        System.out.println(solution(30));
    }
}
