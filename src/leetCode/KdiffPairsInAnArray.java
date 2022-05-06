package leetCode;

import java.util.*;
import java.util.stream.Collectors;

public class KdiffPairsInAnArray {

    public static class Pair {
        int val1, val2;
        Pair(){}
        Pair(int val1, int val2){
            this.val1 = val1;
            this.val2 = val2;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;

            boolean ret = false;
            if (val1 == pair.val1 && val2 == pair.val2){
                ret = true;
            }
            if (val1 == pair.val2 && val2 == pair.val1){
                ret = true;
            }
            return ret;
        }

        @Override
        public int hashCode() {
            return Objects.hash(val1, val2);
        }
    }

    public static int findPairs(int[] nums, int k) {
        int cnt =0;
        Pair newPair = null;

        List<Integer> numsList = Arrays.stream(nums).boxed().sorted().collect(Collectors.toList());

        for(int i = 0; i < numsList.size(); i++){
            for(int j = i+1; j < numsList.size(); j++){
                if(Math.abs(numsList.get(j)-numsList.get(i)) == k){
                    if (newPair  == null){
                        newPair = new Pair(numsList.get(j), numsList.get(i));
                        cnt ++;
                    }else{
                        if(!newPair.equals(new Pair(numsList.get(j), numsList.get(i)))){
                            newPair = new Pair(numsList.get(j), numsList.get(i));
                            cnt ++;
                        }
                    }


                }else if (Math.abs(numsList.get(j)-numsList.get(i)) > k){
                    break;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] num = new int[]{3,1,4,1,5};
        System.out.println(findPairs(num, 2));
    }

}
