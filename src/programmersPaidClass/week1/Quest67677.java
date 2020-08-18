package programmersPaidClass.week1;

public class Quest67677 {
    public int solution(int n) {
        int nextBigInt = n+1;
        while(Integer.bitCount(nextBigInt) != Integer.bitCount(n)){
            nextBigInt++;
        }
        return nextBigInt;

    }

    public static void main(String[] args) {
        System.out.println(new Quest67677().solution(78));
        System.out.println(new Quest67677().solution(15));
    }
}
