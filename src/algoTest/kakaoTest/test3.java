package algoTest.kakaoTest;

import java.util.ArrayList;
import java.util.List;

public class test3 {
    public static int countBalancingElements(List<Integer> arr) {
        // Write your code here
        int counti = 0;
        int answer =0;
        int evenSum = 0;
        int oddSum =0;
        for(int i =0; i<arr.size() ; i+=2){

            int removedInteger = arr.remove(i);

            oddSum += arr.get(i);
            evenSum += arr.get(i+1);

            if(oddSum == evenSum){
                answer =i;
                if(counti == i){
                    counti++;
                }
            }
            arr.add(i, removedInteger );
            oddSum =0;
            evenSum =0;
            if(counti > answer){
                answer = counti;
            }
        }

        return answer;
    }

    public static int countBalancingElement2s(List<Integer> arr) {
        // Write your code here
        int counti = 0;
        int answer =0;
        int evenSum = 0;
        int oddSum =0;
        for(int i =0; i<arr.size() ; i++){

            int removedInteger = arr.remove(i);

            for(int j =0 ; j<arr.size() ; j+=2){
                oddSum += arr.get(j);
            }
            for(int p =1 ; p<arr.size() ; p+=2){
                evenSum += arr.get(p);
            }
            if(oddSum == evenSum){
                answer =i;
                if(counti == i){
                    counti++;
                }
            }
            arr.add(i, removedInteger );
            oddSum =0;
            evenSum =0;
            if(counti > answer){
                answer = counti;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
       /* List<Integer> intList = new ArrayList<>();
        intList.add(2);
        intList.add(1);
        intList.add(6);
        intList.add(4);
        System.out.println(countBalancingElements(intList));*/

        List<Integer> intList2 = new ArrayList<>();
        intList2.add(2);
        intList2.add(2);
        intList2.add(2);

        System.out.println(countBalancingElements(intList2));
    }

}
