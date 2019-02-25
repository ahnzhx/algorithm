package programmers;

import java.util.Arrays;

public class Quest1 {

    public static int solution(int n){
        int answer = 0;
        int sqrtN = (int) Math.sqrt(n);
        boolean []arrN = new boolean[n+1];
        int nPrimeNum[] = new int[n];
        Arrays.fill(nPrimeNum, -1);
        //에라토스테네스의 체
        for(int i = 2 ; i <= sqrtN; ++i){
            if(arrN[i]) continue;
            for(int j = i+i ; j <= n; j+= i)
                arrN[j] = true;
        }

        int idx = 0;
        for(int i = 2 ; i <= n; ++i){
            if(arrN[i] == false)
                nPrimeNum[idx++] = i;
        }

        for(int i = 2; i<=sqrtN; i++){
            n -= i;

            for(int j = 3; j < nPrimeNum.length-1; j++){
                if(nPrimeNum[j] == -1) break;
                for(int k = j; k< nPrimeNum.length; k++){
                    if(nPrimeNum[k] == -1) break;
                    else if(nPrimeNum[j] + nPrimeNum[k] == n)
                        answer++ ;
                }
            }
            n += i;
        }

        return answer;
    }

    public static void main(String []args){
        int n = 33;
        System.out.println(solution(n));
    }
}
