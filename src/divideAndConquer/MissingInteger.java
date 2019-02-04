package divideAndConquer;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {
    //정답률 100%!
    public static int solution(int []A){

        Set<Integer> missingInteger = new HashSet<>();
        for (int i = 1; i<=A.length+1; i++)
            missingInteger.add(i);

        for(int i : A){
            if(missingInteger.contains(i))
                missingInteger.remove(i);
        }


        return missingInteger.iterator().next();
    }

    public static void main(String []args){
        int []A = {-1, -3};
        System.out.println(solution(A));
    }
}
