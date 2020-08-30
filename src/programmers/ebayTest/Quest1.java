package programmers.ebayTest;

import java.util.*;

public class Quest1 {
    class Point{
        private int location;
        private int runtime;

        public Point(int location, int runtime) {
            this.location = location;
            this.runtime = runtime;
        }
    }

    public int solution(int[] T, int[][] R, int k) {
        int answer = 0;
        int n = 0;
        Map<Integer, Point> pointMap = new HashMap<>();

        for(int i =0 ; i < R.length; i++){
            int newRuntime = T[R[i][0]-1] + T[R[i][1]-1];
            pointMap.put(R[i][1], pointMap.get(
                    R[i][1]) != null &&
                    pointMap.get(R[i][1]).runtime > newRuntime ? pointMap.get(R[i][1]): new Point(R[i][0], newRuntime));
        }

        int startPoint = k;
        while(pointMap.get(startPoint) != null){
            answer += pointMap.get(startPoint).runtime ;
            startPoint = pointMap.get(startPoint).location;
            if(pointMap.get(startPoint) != null ){
                answer -= T[startPoint - 1];
            }
        }


        return answer;
    }
}
