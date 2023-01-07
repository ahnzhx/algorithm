import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ret = new ArrayList<>();
        Map<String, List<String>> check = new HashMap<>();

        for(String str : strs){
            char[] strArr = str.toCharArray();
            Arrays.sort(strArr);
            String newStr = new String(strArr);
            if(!check.containsKey(new String(strArr))){
                List<String> sub = new ArrayList<>();
                sub.add(str);
                check.put(newStr, sub);
            }else{
                check.get(newStr).add(str);

            }

        }

        for(String str : check.keySet()){
            ret.add(check.get(str));
        }
        return ret;
    }
}
