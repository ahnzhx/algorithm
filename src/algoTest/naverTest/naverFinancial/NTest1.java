package algoTest.naverTest.naverFinancial;

import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NTest1 {
    private static  int[] nextPermute(int[] nums) {
        int[] copies = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            copies[i] = nums[i];
        }
        int idx = -1;
        for (int i = 0; i < copies.length - 1; i++) {
            if (copies[i] < copies[i + 1]) {
                idx = i;
            }
        }
        if (idx < 0) {
            //Last Permutation
            return null;
        }
        for (int i = copies.length - 1; i > idx; i--) {
            if (copies[idx] < copies[i]) {
                int tmp = copies[idx];
                copies[idx] = copies[i];
                copies[i] = tmp;
                break;
            }
        }
        for (int i = idx + 1; i < (copies.length + idx + 1) / 2; i++) {
            int tmp = copies[i];
            copies[i] = copies[copies.length - (i - idx)];
            copies[copies.length - (i - idx)] = tmp;
        }
        return copies;
    }


    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        Arrays.sort(nums);
        int[] curArray = nums;
        while (true) {
            List<Integer> integerList = new ArrayList<>();
            for (int i = 0; i < curArray.length; i++) {
                integerList.add(curArray[i]);
            }
            permutations.add(integerList);
            int[] nextPermutation = nextPermute(curArray);
            if (nextPermutation == null) {
                break;
            }
            curArray = nextPermutation;
        }
        return permutations;
    }


    public static int solution(int A, int B, int C, int D) {
        int result = 0 ;
        int[] valueList = new int[]{A,B,C,D};
        List<List<Integer>>  permutedArr = permute(valueList);
        for(List<Integer> i : permutedArr){
            int k =0 ;
               if(i.get(k)*10 + i.get(k+1) < 25) {
                   if(i.get(k+2)*10 + i.get(k+3) < 60) result ++;
               }
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(solution(1,8,3,2));
    }

}
