package dynamicProgramming;

import java.io.InputStream;
import java.util.*;

// 모르겠어,,
// 해설: https://stackoverflow.com/questions/44897316/codility-minabssum
public class MinAbsSum {
    static int[] dp;
    public int solution(int[] A) {
        int max =0;
        // abs() 인자값에 대한 절대값을 반환하는 함수
        for(int i =0; i< A.length; i++){
            A[i] = Math.abs(A[i]);
            max = Math.max(A[i], max);
        }

        int sumOfA =0;
        for(int a : A){
            sumOfA += a;
        }

        dp = new int[sumOfA + 1];
        int[] count = new int[max + 1];

        for(int i =0; i<A.length; i++){
            count[A[i]] += 1;
        }

        Arrays.fill(dp, -1);
        dp[0] =0;
        for(int i =1; i< max +1 ; i++){
            if(count[i] > 0){
                for(int j =0 ; j < sumOfA ; j++){
                    if(dp[j] >= 0)
                        dp[j] = count[i];
                    else if( j >= i && dp[j -i] > 0)
                        dp[j] = dp[j-i]-1;
                }
            }
        }

        int result = sumOfA;
        for(int i =0 ; i<Math.floor(sumOfA/2) +1 ; i++){
            if(dp[i] >= 0){
                result = Math.min(result, sumOfA - 2 * i);
            }
        }


        return result;
    }

    public static void main(String[] args) {
        int[] A = new int[]{1,5,2,-2};
        System.out.println(new MinAbsSum().solution(A));
    }
}
