package baekjoon;
import java.util.*;


public class Baekjoon1759 {
    static List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
    static List<String> ret = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int objects = sc.nextInt();
        List<Character> strList = new ArrayList<>();

        for(int i =0 ; i < objects; i++){
            strList.add(sc.next().charAt(0));
        }
//        List<String> strList = Arrays.asList("a", "t", "c", "i", "s", "w");

        Collections.sort(strList);

        String str = "";
        process(str, number, strList, 0,0, 0);
        for(String strValue : ret){
            System.out.println(strValue);
        }

    }

    public static void process(String str, int number, List<Character> strList, int start, int numVowels, int numConsonant){
        if(str.length() == number && numConsonant >= 2 && numVowels >= 1){
            ret.add(str);
            return ;
        }

        for(int i =start; i < strList.size() ; i++){
            if(vowels.contains(strList.get(i))){
                process(str + strList.get(i), number, strList, i+1, numVowels+1, numConsonant);
            }

            if(!vowels.contains(strList.get(i))){
                process(str + strList.get(i), number, strList, i + 1, numVowels, numConsonant+1);
            }

        }
    }
}
