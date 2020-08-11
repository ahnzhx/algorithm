package programmersPaidClass.week1;

public class Quest67677 {
    public int solution(int n) {
        int countOne = numberOfOneCheck(n);

        int countOneOfNextBigInteger = 0;
        int nextBigInteger = n;
        while(countOne != countOneOfNextBigInteger){
            nextBigInteger++;
            countOneOfNextBigInteger = numberOfOneCheck(nextBigInteger);
        }
        return nextBigInteger;
    }

    public int numberOfOneCheck (int checkingNumber){
        int numberOfOne = 0;
        String binaryN = Integer.toBinaryString(checkingNumber);
        char[] charBinaryN  = binaryN.toCharArray();
        for(char character : charBinaryN){
            if(character == '1')
                numberOfOne++;
        }
        return numberOfOne;
    }

    public static void main(String[] args) {
        System.out.println(new Quest67677().solution(78));
        System.out.println(new Quest67677().solution(15));
    }
}
