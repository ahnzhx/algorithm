package divideAndConquer.sorting;


import java.util.HashSet;
import java.util.Set;

public class Distinct {

    //더 쉬운답
    public static int solution2(int []A){
        Set<Integer> set = new HashSet<>();
        for(int i : A){
            set.add(i);
        }

        return set.size();
    }
    public static void main(String []args){
        int []A = {2,1,1,2,3,1};
        System.out.println(solution2(A));
    }
}
