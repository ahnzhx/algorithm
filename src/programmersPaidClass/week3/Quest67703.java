package programmersPaidClass.week3;

import java.util.*;

public class Quest67703 {
    private static final int east = +1;
    private static final int west = -1;
    private static final int north = -1;
    private static final int south = 1;



    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        Stack<Location> stack = new Stack<>();
        // 방문 좌표와 거리
        Map<Location, Integer> visited = new HashMap<>();

        // 시작점, 도착점
        Location now = new Location(0,0);
        Location last = new Location(0,0);

        visited.put(now, 1);
        stack.push(now);

        while(!stack.isEmpty()){
            now = stack.pop();

            for(int i =0 ; i < 4; i++){
                Location next = now.moveTo(i);
                // 맵을 벗어난 경우 / 이미 방문한 좌표일 경우 / 방문할 좌표가 벽인 경우
                if(next.isValid(n, m) ){

                }
            }

            if(now.isArrived(maps)){
                //answerList.add();
            }
        }
        Collections.sort(answerList);
        if(answerList.isEmpty()){
            return -1;
        }
        return answerList.get(0);
    }

    class Location{
        private int x;
        private int y;

        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Location moveTo(int dir){
            int[] dx = {-1, 1, 0, 0}, dy = {0,0, -1, 1};
            return new Location(x + dx[dir], y + dy[dir]);
        }

        public boolean isArrived(int[][] maps){
            if(x == maps[0].length-1 && y == maps.length-1)
                return true;
            return false;

        }
    }
}
