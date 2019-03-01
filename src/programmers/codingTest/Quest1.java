package programmers.codingTest;

public class Quest1 {

    public static int solution(int n){
        int answer = 0;
        int sqrtN = (int) Math.sqrt(n);
        int []arrN = new int[n+1];

        //에라토스테네스의 체
        for(int i = 2 ; i <= sqrtN; ++i){
            if(arrN[i] == -1) continue;
            for(int j = i+i ; j <= n; j+= i)
                arrN[j] = -1;
        }

        for(int i = 2; i<=sqrtN; i++){
            n -= i;
            for(int j = i+1; j < arrN.length-1; j++){
                if(arrN[j] == -1) continue;
                for(int k = j+1; k< arrN.length; k++){
                    if(arrN[k] == -1) continue;
                    else if(j+k == n)
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
