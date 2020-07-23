package dynamicProgramming;

public class MinAbsSum {
    public int solution(int[] A) {
        int[] S = new int[]{1, -1};
        int[][] sum = new int[A.length][A.length];

        for(int i = 0 ; i< A.length ; i++){
            for(int j =0 ; j < A.length ; j++){
                for(int s : S){
                    sum[i][j] += (A[i] * s);
                }
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        int[] A = new int[]{1,5,2,-2};
        System.out.println(new MinAbsSum().solution(A));
    }
}
