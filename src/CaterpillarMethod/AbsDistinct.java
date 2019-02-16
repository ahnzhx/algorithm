package CaterpillarMethod;

import java.util.HashSet;
import java.util.Set;

public class AbsDistinct {

    // O(N) or O(N*log(N)) 100%
    public static int solution(int []A){
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i< A.length; i++){
            if (set.contains(Math.abs(A[i])))
                continue;
            else
                set.add(Math.abs(A[i]));
        }
        return set.size();
    }

    public static void main(String []args){
        int[] a = {-5, -3, -1, 0, 3, 6};
        System.out.println(solution(a));
    }

}
