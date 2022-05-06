package leetCode;

public class EditDistance {
    static int ret = 0;
    static int count = 0;
    public static int minDistance(String word1, String word2) {
        int index = 0;
        if (word2.length() == index || word1.length() == index) {
            ret = Math.max(word1.length(), word2.length());
        }else{
            common(word1, word2);
        }

        return ret;
    }

    public static void common(String word1, String word2){
        if(word1.length() > 0 || word2.length() > 0){

            for(int i = 0; i < word1.length(); i++){
                if(word2.length() > i ){
                    //todo execution 에 e가 2개 있을때 결과값 어떻게 나오는지 확인하기
                    int includedCharInWord2 = word2.indexOf(word1.charAt(i));
                    if( includedCharInWord2 > -1){
                        //알파벳 위치와 알파벳이 동일한 경우
                        if(includedCharInWord2 == i) {
                            count++;
//                            ret += Math.max(i, includedCharInWord2);
                            common(word1.substring(0, i), word2.substring(0, includedCharInWord2));
                            common(word1.substring(i+1), word2.substring(includedCharInWord2+1));
                            break;
                        }else if(includedCharInWord2 != i && count > 0){
                            ret += Math.max(i, includedCharInWord2);
                            common(word1.substring(i+1), word2.substring(includedCharInWord2+1));
                        }
                    }else if(count > 0){
                        ret += Math.max(word1.length(), word2.length());

                        break;
                    }
//                    break;
                }else{
                    ret += Math.max(word1.length(), word2.length());

                    break;
                }
            }
        }

    }


    public static void main(String[] args) {
//        String word1 = "horse";
//        String word2 = "ros";
//        String word1 = "sea";
//        String word2 = "eat";
//        String word1 = "intention";
//        String word2 = "execution";
//          String word1 = "";
//        String word2 = "a";
//       String word1 = "mart";
//        String word2 = "karma";
        String word1 = "plasma";
        String word2 = "altruism";
        //          String word1 = "b";
//        String word2 = "a";
//          String word1 = "a";
//        String word2 = "a";
        System.out.println(minDistance(word1, word2));
    }
}
