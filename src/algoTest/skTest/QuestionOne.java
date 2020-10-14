package algoTest.skTest;

public class QuestionOne {
    public int solution(int A, int B){
        int answer = 0;

        String binaryValueOfAMultiplyB =  Integer.toBinaryString(A*B);

        for(char binaryValue : binaryValueOfAMultiplyB.toCharArray()){
            if(binaryValue == '1'){
                answer ++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new QuestionOne().solution(3,7));
    }
}
