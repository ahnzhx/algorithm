package capitalOne;

public class Quest2_2 {
    // 3이 나와야 하는데 4가 나옴. 디버깅 해보기
    public static int solution(int[] arr){
        int[] dp = new int[arr.length+2];

        for(int i =2; i<arr.length+2; i++){
            if(arr[i% (arr.length)] != arr[(i-1) % (arr.length)]){
                if(arr[(i-1)%(arr.length)] != arr[(i-2)%(arr.length)]){
                    dp[i] = dp[i-1]+1;
                }else{
                    dp[i] = dp[i-1];
                }
            }else{
                dp[i] = dp[i-1];
            }
        }

        return dp[arr.length+1];
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,1,1,1};
        System.out.println(solution(arr));
    }
}
