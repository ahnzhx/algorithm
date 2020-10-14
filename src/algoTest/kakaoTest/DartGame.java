package algoTest.kakaoTest;

public class DartGame {
    // 정답,, 나는 못풀었음
    public static int solution2(String dartResult) {

        char[] darts = dartResult.toCharArray();
        int[] score = new int[3];
        int cnt = -1;

        for (int i = 0; i < darts.length; i++) {
            if (darts[i] >= '0' && darts[i] <= '9') {
                cnt++;
                if (darts[i] == '1' && darts[i + 1] == '0') { // 10인경우
                    score[cnt] = 10;
                    i++;
                } else {
                    score[cnt] = darts[i] -'0';
                }
            } else if (darts[i] == 'D') {
                score[cnt] *= score[cnt];
            } else if (darts[i] == 'T') {
                score[cnt] *= score[cnt] * score[cnt];
            } else if (darts[i] == '*') {
                if (cnt > 0) {
                    score[cnt - 1] *= 2;
                }
                score[cnt] *= 2;
            } else if (darts[i] == '#') {
                score[cnt] *= -1;

            }
        }
        return score[0] + score[1] + score[2];

    }

    public static void main(String[] args) {
        //1S*2T*3S / 1S2D*3T / 1D#2S*3S
        int answer = solution2("1S*2T*3S");
        System.out.println(answer);
    }
}
