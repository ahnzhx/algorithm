public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int minLength = Integer.MAX_VALUE;
        int index = 0;
        for(int i =0 ; i < strs.length; i++){
            if(strs[i].length()< minLength){
                minLength = strs[i].length();
                index =i;
            }
        }

        StringBuilder temp =new StringBuilder(strs[index]);
        for(int k =0; k < strs.length; k++){
            for(int i = temp.length(); i >=0; i--){
                temp = new StringBuilder(temp.substring(0, i));
                if(strs[k].substring(0, i).contains(temp)){
                    break;
                }
            }
        }

        return temp.toString();
    }
}
