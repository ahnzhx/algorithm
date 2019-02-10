package prefixSums;

public class CountDiv {
    //50% (performance 0점받음)
    public static int solution(int A, int B, int K){
        int count = 0;
        for(int i = A; i <= B ; i++){
            if(i % K == 0 ){
                count ++;
            }
        }
        return count;
    }
    //100%    O(1)
    public static int answer_solution(int A, int B, int K){

        return (B/K) -(A/K) + (A%K == 0? 1: 0);
    }

    public static void main(String []args){
        System.out.println(answer_solution(6, 11, 2));
    }

}
