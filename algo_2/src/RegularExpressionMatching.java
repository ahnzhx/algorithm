// todo I have not solved yet.
public class RegularExpressionMatching {
    public boolean isMatch(String s, String p){
        char[] sArr = s.toCharArray();
        char[] pArr = p.toCharArray();
        int pPointer = 0;int sPointer = 0;
        int count = 0;

        while(pPointer < pArr.length){
            if(pArr[pPointer] == '*'){
                if(pPointer == pArr.length-1){
                    return true;
                }
                count++;
                sPointer++;
            }else if( 97 <= pArr[pPointer] && pArr[pPointer] <=122){
                if(pArr[pPointer] == sArr[sPointer]) {
                    count++;
                    sPointer++;
                }
            }else{
                count++;
            }
            pPointer ++;

        }

        if(count == sArr.length){
            return true;
        }else{
            return false;
        }
    }

}
