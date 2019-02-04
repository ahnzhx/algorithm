package divideAndConquer;

public class TapeEquilibrium {
    //내가 쓴 답
    public static int solution(int []A){
        int firstSum = 0;
        int secondSum = 0;
        int difference = 0;
        int p = 1;
        int N = A.length;
        while (p < N){
            for(int i =0 ; i < p; i++){
                firstSum += A[i];
            }
            for(int i = p; i < N ; i++){
                secondSum += A[i];

            }
            difference = Math.min(firstSum, secondSum);

            firstSum =0 ;
            secondSum = 0;
            p++;
        }
        return difference;
    }

    //인터넷에서 찾은 답
    public int bestSolution(int []A){
        int total = 0;
        for(int i = 0; i<A.length; i++)
            total += A[i];

        int diff = Integer.MAX_VALUE;
        int prev =0;
        int next = total;

        for(int p =1 ; p< A.length; p++){
            prev += A[p-1];
            next -= prev;
            diff = Math.min(diff, Math.abs(prev-next));
        }
        return diff;
    }

    public static void main(String []args){
        int[] a= {3,1,2,4,3};

        System.out.println(solution(a));
    }
}
