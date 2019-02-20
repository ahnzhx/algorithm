package greedyAlgorithms;

public class TieRopes {

    //O(N)
    public static int solution(int k, int[]A){
        int length = 0;
        int result = 0;
        for(int rope : A){
            length += rope;
            if(length >= k){
                result++;
                length = 0;
            }
        }
        return result;
    }

    public static void main(String []args){
        int a[] = {1,2,3,4,1,1,3};
        System.out.println(solution(4, a));
    }
}
