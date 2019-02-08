package leader;

import java.util.HashMap;

public class Dominator {
    // 58%
    public static int solution(int[] A){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int moreThanHalf = A.length/2;
        int returnValue = -1;
        for(int i = 0; i< A.length; i++){
            if (hashMap.containsKey(A[i])){
                int count = hashMap.get(A[i]);
                count++;
                hashMap.put(A[i], count);
            }else{
                hashMap.put(A[i], 1); //hashMap 초기화
            }
            if(hashMap.get(A[i]) == moreThanHalf){
                returnValue = i;
            }

        }
        if(returnValue == -1)
            return -1;

        return returnValue;
    }

    // 100% / O(N) time with O(1) space
    public static int solution2 (int []A){
        int indexOfCandidate = -1;
        int stackCounter = 0, candidate = -1, value=-1, i =0;

        for(int element: A ) {
            if (stackCounter == 0) {
                value = element;
                ++stackCounter;
                indexOfCandidate = i;
            } else {
                if (value == element) {
                    ++stackCounter;
                } else {
                    --stackCounter;
                }
            }
            ++i;
        }

        if (stackCounter > 0 ) {
            candidate = value;
        } else {
            return -1;
        }

        int countRepeat = 0;
        for (int element: A) {
            if( element == candidate) {
                ++countRepeat;

            }
            if(countRepeat > (A.length / 2)) {
                return indexOfCandidate;
            }
        }
        return -1;
    }

    public static void main(String []args){
        int [] a = {1, 1, -1, -1, -1, -1, 2};
        System.out.println(solution2(a));
    }
}
