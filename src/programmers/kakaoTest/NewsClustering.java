package programmers.kakaoTest;

import java.util.*;

public class NewsClustering {
    public static int solution2(String str1, String str2) {
        int intersection = 0;
        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();
        List<String> list1 = new ArrayList<>(1000);
        List<String> list2 = new ArrayList<>(1000);
        int largeSize = Math.max(arr1.length, arr2.length);
        for(int i = 0; i < largeSize - 1; i++) {
            if(i < arr1.length - 1 && Character.isLetter(arr1[i]) && Character.isLetter(arr1[i+1])) {
                list1.add("" + arr1[i] + arr1[i+1]);
            }
            if(i < arr2.length - 1 && Character.isLetter(arr2[i]) && Character.isLetter(arr2[i+1])) {
                list2.add("" + arr2[i] + arr2[i+1]);
            }
        }
        List<String> larger = (list1.size() > list2.size()) ? list1 : list2;
        List<String> smaller = (larger == list1) ? list2 : list1;
        for(Iterator<String> it = smaller.iterator(); it.hasNext();) {
            String str = it.next();
            if(larger.contains(str)) {
                larger.remove(str);
                it.remove();
                intersection++;
            }
        }

        int union = larger.size() + smaller.size() + intersection;

        return (intersection == 0 && union == 0) ? 65536 : (int) ((intersection/ (double) union) * 65536);
    }
    public static void main(String[] args) {
        String str1= "FRANCE";
        String str2= "FRENCH";

        String str3  = "E=M*C^2";
        String str4  = "e=m*c^2";

        String str5  = "aa1+aa2";
        String str6  = "AAAA12";

        int answer = solution2(str1, str2);
        System.out.println(answer);
    }
}
