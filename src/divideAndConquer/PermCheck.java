package divideAndConquer;

public class PermCheck {
    public static int solution(int []A){
        int N = A.length;
        int sum = N*(N+1)/2;
        for(int i: A)
            sum -= i;

        if(sum == 0)
            return 1;
        else
            return 0;
    }

    public static int answerSolution(int []A){

        boolean[] seen = new boolean[A.length+1];

        //repeat elements
        for (int i : A){
            if(i < 1 || i > A.length ) return 0;
            /**
             * {1,1,4}일 경우
             */
            if(seen[i] == true) return 0;
            else seen[i]= true;
        }

        return 1;
    }
    public static void main(String args[]){
        int []a = {4,1,3,2};
        int []b = {4,1,3};
        System.out.println(answerSolution(a));
        System.out.println(answerSolution(b));
    }
}
