package programmers.skTest;

public class QuestionTwo {
    public int[] solution(int[] A, int F, int M ){
        int[] answer = new int[F+1];
        int sumOfA = 0; int idx =0;
        for(int aValue : A){
            sumOfA += aValue;
        }
        int sumOfF = (M * (A.length + F)) - sumOfA;

        int everySumCase[][] = new int[F+1][sumOfF+1];

        for(int s = 1; s <=6; s++ ){
            everySumCase[1][s] = 1; // 주사위 1개만 쓸때 초기화
        }
        for(int i =2 ; i <= F; i++){
            for(int j =1; j <= sumOfF ; j ++){
                if(j <= 6){
                    for(int k = 1; k < j ; k++){
                        everySumCase[i][j] += everySumCase[i-1][k];
                        if(j == sumOfF){
                            answer[idx++] = k;
                            answer[idx++] = sumOfF-k;
                        }
                    }
                }else{
                    for(int k = j-6; k <= 6 ; k++){
                        everySumCase[i][j] += everySumCase[i-1][k];
                        if(j == sumOfF){
                            answer[idx++] = k;
                            answer[idx++] = sumOfF-k;
                        }

                    }
                }


            }

        }



        return answer;
    }

    public static void main(String[] args) {
        int[] a = new int[]{3,2,4,3}; // 6 6
        int[] b = new int[]{1,5,6}; // 2,1,2,4    6,1,1,1
        int[] c = new int[]{1,2,3,4}; // 0
        int[] d = new int[]{6,1}; // 0


//        int[] aResult = new QuestionTwo().solution(a, 2,4 );

        int[] bResult = new QuestionTwo().solution(b, 4,3 );
//        int[] cResult = new QuestionTwo().solution(c, 4,6 );

//        for(int result : aResult){
//            System.out.println(result);
//        }

        for(int result : bResult){
            System.out.println(result);
        }

//        for(int result : cResult){
//            System.out.println(result);
//        }

    }
}
