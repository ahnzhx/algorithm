package programmers.bruteForce;

public class InnorulesTest {

    public static int evenSum (int k){
        if(k <2) return k;
        else return k+ evenSum(k-2);

    }
    public static void main(String[] args) {
        int n = 25;
        if(n %2 ==0) System.out.println(evenSum(n));
        else System.out.println(evenSum(n-1));

    }
}
