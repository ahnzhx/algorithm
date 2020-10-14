package algoTest.ebayTest;

import java.util.ArrayList;
import java.util.List;

public class Quest2 {
    public int solution(int n, int m, int p) {
        int answer = 0;
        // 식인종 -1  사람 1
        List<Integer> aLand = new ArrayList<>();
        List<Integer> bLand = new ArrayList<>();
        List<Integer> boat = new ArrayList<>();

        for(int i =0 ; i< n; i++){
            aLand.add(1);
        }
        for(int i =0 ; i< m; i++){
            aLand.add(-1);
        }

        boolean isALand = true;
        while ( !aLand.isEmpty()){
            //  1회
            if(isALand){
                for(int i =0 ; i < boat.size() ; i++){
                    aLand.add(boat.get(i));
                    boat.remove(i);
                }

                aLand.remove(-1);
                aLand.remove(-1);
                boat.add(-1);
                boat.add(-1);

                bLand.add(-1);
                bLand.add(-1);
                boat.remove(-1);
                boat.remove(-1);




                if(numberOfN(aLand) > numberOfM(aLand)){
                    isALand = !isALand;
                }
            }else{
                bLand.remove(-1);
                boat.add(-1);
                aLand.add(-1);
                boat.remove(-1);
                if(numberOfN(aLand) > numberOfM(aLand)){
                    isALand = !isALand;
                }
            }

            answer++;

            //2회

            if(bLand.size() == n+m){
                break;
            }
        }
        return answer;
    }

    private int numberOfN (List<Integer> land){
        return (int) land.stream().filter(i -> i == 1).count();
    }
    private int numberOfM(List<Integer> land){
        return (int) land.stream().filter(i -> i == -1).count();
    }
}
