package primeAndCompositeNumbers;

public class CountFactors {
    // timeout error O(N)
    public static int solution(int N){
        int count =0 ;
        for(int i = 1; i <= N ; i++){
            if(N%i == 0){
                System.out.println(N/i);
                count ++;
            }
        }

        return count;
    }

    // O(sqrt(N))
    public static int solution2(int N){
        int result = 0;
        final int sqrtN = (int) Math.sqrt(N);
        for (int i = 1; i <= sqrtN; i++)
        {
            if (N % i == 0)
            {
                // We found 2 factors: i and N/i.
                result += 2;
            }
        }

        if (sqrtN * sqrtN == N)
        {
            // We counted sqrtN twice.
            result--;
        }
        return result;
    }

    public static void main(String []args){
        int n = 24;
        System.out.println(solution2(n));
    }
}
