package divideAndConquer;

import java.util.HashSet;
import java.util.Set;

public class PermMissingElem {
    public static int solution(int[] A){
        int ALength = A.length+1;
        Set<Integer> set = new HashSet<>();
        for(int i =1; i <= ALength ; i++)
            set.add(i);

        for(int i : A){
            if(set.contains(i))
                set.remove(i);
        }
        return set.iterator().next();
    }

    //인터넷에서 찾은 값
    public int foundInInternetSolution(int[] A){
        long N = A.length + 1;
        long sum = N * (N + 1) / 2;
        for (int i = 0; i < A.length; i++) sum -= A[i];
        return (int) sum;
    }

    public static void main(String []args){
        int[] A = {2,3,1,5};
        System.out.println(solution(A));
    }
}
