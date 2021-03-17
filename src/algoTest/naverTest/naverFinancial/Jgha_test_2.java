package algoTest.naverTest.naverFinancial;

public class Jgha_test_2 {
    public String solution(int N){
        StringBuilder reverseOrder = new StringBuilder();
        Integer divide = 10;

        int remainder = N % divide;
        N /= divide;
        reverseOrder.append(remainder);
        while(N > 0){
            remainder = N % divide;
            N /= divide;
            reverseOrder.append(remainder);
        }

        return reverseOrder.toString();
    }
}
