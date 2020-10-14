package algoTest.elevenStreet;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Quest1 {
    public static int findMaxSum(List<Integer> list) {

//        list.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });
        Collections.reverseOrder();
        return list.get(0) + list.get(1);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 9, 7, 11);
        System.out.println(findMaxSum(list));
    }
}
