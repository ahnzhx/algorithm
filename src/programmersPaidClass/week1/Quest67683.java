package programmersPaidClass.week1;

import java.util.*;

public class Quest67683 {
    public String[] solution(String[] strings, int n){
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.charAt(n) == o2.charAt(n)){
                    return o1.compareTo(o2);
                }
                return o1.charAt(n) - o2.charAt(n);
            }
        });
        return strings;
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"sun", "bed", "car"};
        String[] strings2 = new String[]{"abce", "abcd", "abca", "abc", "cdx"};
        System.out.println(new Quest67683().solution(strings, 1));
        //System.out.println(new Quest67683().solution(strings2, 2));
    }
}
