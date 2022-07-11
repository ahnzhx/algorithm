package leetCode;

public class EditDistance {

    public static int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()+1][word2.length()+1];

        for(int i = 0; i <= word1.length(); i ++){
            for(int j = 0; j <= word2.length(); j++){
                if(i == 0){
                    dp[i][j] = j;
                }
                else if(j == 0){
                    dp[i][j] = i;
                } else {
                    if(word1.charAt(i-1) != word2.charAt(j-1)){
                        int tempMin = Math.min(dp[i-1][j], dp[i][j-1]);
                        dp[i][j] = Math.min(tempMin, dp[i-1][j-1])+1;
                    }else{
                        dp[i][j] = dp[i-1][j-1];
                    }
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }


    public static void main(String[] args) {
        String word1 = "horse";
        String word2 = "ros";
//        String word1 = "sea";
//        String word2 = "eat";
//        String word1 = "intention";
//        String word2 = "execution";
//          String word1 = "";
//        String word2 = "a";
//       String word1 = "mart";
//        String word2 = "karma";
//        String word1 = "plasma";
//        String word2 = "altruism";
        //          String word1 = "b";
//        String word2 = "a";
//          String word1 = "a";
//        String word2 = "a";
        System.out.println(minDistance(word1, word2));
    }
}
