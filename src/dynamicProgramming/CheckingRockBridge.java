package dynamicProgramming;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class CheckingRockBridge {
    static String scroll = ""; //마법의 두루마리
    static String[] bridge = new String[2];
    static final int MAX = 100 + 1;
    static final int SCROLLMAX = 20;
    static int[][][] cache = new int[2][MAX][SCROLLMAX];

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
//        scroll = scanner.next();
//        bridge[0] = scanner.next();
//        bridge[1] = scanner.next();
        scroll = "RGS";
        bridge[0] = "RINGSR";
        bridge[1] = "GRGGNS";
//        int a = 16 + 7 + 6 + 5 + 4 + 3  + 1;

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int[][] ints : cache) {
            for (int[] anInt : ints) {
                Arrays.fill(anInt, -1);
            }
        }


        int result = 0;

        //천사 돌다리, 악마 돌다리 둘 중 하나에서 시작

        for (int i = 0; i < 2; i++)
            result += numOfWays(i, 0, 0);

        System.out.println(result);
    }

    public static int numOfWays(int col, int row, int idx) {
        //기저 사례: 마법의 두루마리와 동일한 문자열을 모두 지났을 경우
        if (idx == scroll.length()) return 1;

        int result = cache[col][row][idx];

        if (result != -1) return result;

        result = 0;

        for (int i = row; i < bridge[0].length(); i++) {
            //마법의 두루마리 인덱스에 적혀있는 문자와 해당 다리 인덱스에 적혀있는 문자 동일할 경우
            if (bridge[col].toCharArray()[i] == scroll.toCharArray()[idx])
                result += numOfWays(1 - col, i + 1, idx + 1);
        }

        return result;

    }

}