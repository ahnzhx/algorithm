package baekjoon;

import java.math.BigInteger;
import java.util.*;

public class Backjoon14569 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        BigInteger s = new BigInteger("0");
        for(int j = 0; j < k ; j++){
            int st = sc.nextInt();
            s = (s || 1 << st);
        }
    }
}
