package algoTest.naverTest;

import java.util.Arrays;

public class BiggestNumber {
    public static String solution(int[] numbers) {
        String[] arr = new String[numbers.length];
        for(int i =0; i<numbers.length ; i++)
            arr[i] = String.valueOf(numbers[i]);
        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 +o2));
        if(arr[0].equals("0")){
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for(int i =0; i<arr.length ; i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] number = {6, 10, 2};
        int[] number2 = {3, 30, 34, 5, 9};
        System.out.println(number);
        System.out.println(number2);
    }
}
