package leader;

import java.util.HashMap;

public class EquiLeader {

    /**
     * The leader of this array is the value that occurs
     * in more than half of the elements of A.
     **/
    //O(N)
    public static int solution(int[] A){
        int leader=-1;
        int countOfLeader=0;

        HashMap<Integer, Integer> hashMap=new HashMap<>();

        for(int i=0;i<A.length;i++){
            if(hashMap.containsKey(A[i])){
                int count = hashMap.get( A[i] );
                count++;
                hashMap.put(A[i], count);
                if(countOfLeader < count){
                    countOfLeader = count;
                    leader = A[i];
                }
            }else{
                hashMap.put(A[i], 1);
            }
        }

        if(countOfLeader < A.length / 2){
            return 0;
        }


        int countEquil=0;
        int counterOfrLeaderInRight=0;
        int counterOfrLeaderInLeft=countOfLeader;

        for(int i=A.length-1;i>=0;i--){
            if(A[i]==leader){
                counterOfrLeaderInRight++;
                counterOfrLeaderInLeft--;
            }

            if(counterOfrLeaderInLeft>i/2 && counterOfrLeaderInRight>((A.length-i)/2)){
                countEquil++;
            }
        }
        return countEquil;
    }

    public static void main(String []args){
        int[] a = {4,3,4,4,4,2};
        System.out.println(solution(a));
    }

}
