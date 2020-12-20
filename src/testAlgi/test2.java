package testAlgi;

public class test2 {
    public int solution(String S, int[] C) {
        char[] sArr = S.toCharArray();
        char prev = sArr[0];
        int answer = 0 ;

        for(int i =1 ; i < sArr.length; i++){
            if(prev == sArr[i]){
                if(C[i-1] < C[i]){
                   answer += C[i-1];
                }
            }else{
                prev = sArr[i];
            }

        }
        return answer;
    }
}
