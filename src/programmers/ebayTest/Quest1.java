package programmers.ebayTest;

import java.util.*;

// 풀었음
public class Quest1 {
    class Point{
        private int location;
        private int runtime;

        public int getLocation() {
            return location;
        }

        public int getRuntime() {
            return runtime;
        }

        public Point(int location, int runtime) {
            this.location = location;
            this.runtime = runtime;
        }

    }

    public int solution(int[] T, int[][] R, int k) {
        int answer = 0;
        Map<Integer, Point> pointMap = new HashMap<>();

        for(int i =0 ; i < R.length; i++){
            int newRuntime = T[R[i][0]-1] + T[R[i][1]-1];
            pointMap.put(R[i][1], pointMap.get(
                    R[i][1]) != null &&
                    pointMap.get(R[i][1]).runtime > newRuntime ? pointMap.get(R[i][1]): new Point(R[i][0], newRuntime));
        }

        int startPoint = k;
        while(pointMap.get(startPoint) != null){
            answer += pointMap.get(startPoint).getRuntime();
            startPoint = pointMap.get(startPoint).getLocation();
            if(pointMap.get(startPoint) != null ){
                answer -= T[startPoint - 1];
            }
        }


        return answer;
    }
}
