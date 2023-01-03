public class StrStr {
    public int strStr(String haystack, String needle) {
        char[] haystackArr = haystack.toCharArray();
        char[] needleArr = needle.toCharArray();
        int Hlow =0;
        int HlowBackup =0;
        int pointerN =0;
        int ans = Integer.MAX_VALUE;
        int cnt = 0;
        while( Hlow < (haystackArr.length)){
            if (haystackArr[Hlow] == needleArr[pointerN]) {
                HlowBackup = Hlow;
                while(pointerN < (needleArr.length) && Hlow <haystackArr.length ){
                    if (haystackArr[Hlow] == needleArr[pointerN]) {
                        cnt++;
                    }
                    if(cnt == needleArr.length){
                        ans = Math.min(ans, HlowBackup);
                        break;
                    }
                    pointerN++;
                    Hlow++;
                }
                cnt = 0;
                pointerN = 0;
                Hlow = HlowBackup+1;
            }else{
                Hlow++;
            }


        }

        if(ans == Integer.MAX_VALUE){
            ans = -1;
        }
        return ans;
    }

}