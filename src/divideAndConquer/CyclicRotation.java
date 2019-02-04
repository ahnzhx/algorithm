package divideAndConquer;


import java.util.LinkedList;
import java.util.List;

public class CyclicRotation {
    //내가 푼것
    public static int[] solution(int []A, int K){
        List<Integer> list = new LinkedList<Integer>();
        if( A.length == 0 ){ //배열이 비어있을 경우
            return A;
        }else {
            for (int i: A){
                list.add(i);
            }

            for(int i = 0 ; i < K; i++){
                ((LinkedList<Integer>) list).addFirst(((LinkedList<Integer>) list).getLast());
                ((LinkedList<Integer>) list).removeLast();

            }

            for(int i = 0 ; i < A.length; i++){
                A[i] = list.get(i);
            }
            return A;
        }
    }

    //Git에서 본 답
    public static int[] gitSolution(int []A, int K){
        int ALength = A.length;
        if(ALength == 0)
            return A;
        if(K >= ALength)
            K %= ALength;
        if(K == 0)
            return A;

        int [] returnArray = new int[ALength];
        for(int i =0 ; i<ALength; i++)
            returnArray[i] = (i < K) ? A[ALength+i -K] : A[i -K];
        return returnArray;
    }

    public static void main(String []args){
        int a[] = {3,8,9,7,6};

        gitSolution(a, 3);
    }

}