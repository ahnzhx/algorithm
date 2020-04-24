package programmers.kakaoTest;

/**
 * 멀쩡한 사각형
 * (최대공약수, 최소공배수 구하는 방법 기본으로 알아놓기)
 * (직각 사각형에서 대각선을 그었을 때, 멀쩡한 사각형 구하는 공식 : 가로 + 세로 -1 ,,, ㅅㅂ 이걸 어케알어!!)
 */
public class Square {
    public long solution(int w,int h) {
        long squareNum = (long)w * (long)h;
        long remain = 1;
        long min = Math.min(w,h);
        long max = Math.max(w,h);
        while(remain > 0){
            remain = max % min;
            max = min;
            min = remain;
        }
        return squareNum - ((w/max) + (h/max) -1)*max ;
    }
}
