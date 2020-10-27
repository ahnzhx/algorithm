package baekjoon;

// TODO: 푸는중임
public class Baekjoon15829 {
    public int solution(String str){
        char[] strs = str.toCharArray();
        int sum  = 0 ;
        for(int i =0 ; i < strs.length ; i++){
            sum += (strs[i] - 56) * (32^i);
        }
        return sum;
    }
}
