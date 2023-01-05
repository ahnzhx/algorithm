import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        boolean[] check = new boolean[s.length()];
        HashMap<String, Integer> rhm = romanHashMap();

        int sum =0;

        for(int i =0 ; i < s.length()-1; i++){
            if(rhm.get(s.substring(i, i+2)) != null && !check[i] && !check[i+1]){
                sum += rhm.get(s.substring(i, i+2));
                check[i+1] = true;
                check[i]= true;
            }
        }
        for(int i =0 ; i < s.length(); i++){
            if(!check[i]){
                sum += rhm.get(s.substring(i, i+1));
                check[i] = true;
            }
        }

        return sum;
    }

    public HashMap<String, Integer> romanHashMap(){
        HashMap<String, Integer> roman = new HashMap<>();
        roman.put("I", 1);
        roman.put("V", 5);
        roman.put("X", 10);
        roman.put("L", 50);
        roman.put("C", 100);
        roman.put("D", 500);
        roman.put("M", 1000);
        roman.put("IV", 4);
        roman.put("IX", 9);
        roman.put("XL", 40);
        roman.put("XC", 90);
        roman.put("CD", 400);
        roman.put("CM", 900);
        return roman;
    }
}
