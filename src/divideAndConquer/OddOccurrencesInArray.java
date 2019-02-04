package divideAndConquer;


import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {
    public static int solution(int[] A){
        Set<Integer> set = new HashSet<>();
        for(int i : A){
            if(set.contains(i)){
                set.remove(i);
            }else{
                set.add(i);
            }
        }
        return set.iterator().next();
    }


    public static void main(String args[]){

    }
}
