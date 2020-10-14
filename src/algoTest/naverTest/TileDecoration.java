package algoTest.naverTest;

public class TileDecoration {
    public static long solution(int N) {
        long answer = 0;
        long[] sides = new long[N];
        int side =1;
        sides[0] = side;
        sides[1] = side;
        for(int i = 1 ; i < N-1 ; i++){
            sides[i + 1] = sides[i] + sides[i-1];
        }


        answer += sides[N-1]*4;
        answer += sides[N-2]*2;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(5));
        System.out.println(solution(6));
    }
}
