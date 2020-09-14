package baekjoon.bfs;

import java.util.*;

public class Backjoon2178 {
    class Point{
        private final int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Point moveTo(int dir){
            int[] dx = {-1, 1, 0, 0}, dy = {0, 0, -1, 1};
            return new Point(x + dx[dir], y + dy[dir]);

        }

        public boolean isValid(int N, int M){
            return x >= 0 && x < N && y >= 0 && y < M;
        }

        public char getMapValue(char[][] map){
            return map[x][y];
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x &&
                    y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public int solution(String[] roads){
        int N = roads.length;
        int M = roads[0].length();

        Queue<Point> q = new LinkedList<>();
        Map<Point, Integer> visited = new HashMap<>();
        char[][] maps = new char[N][M];

        for(int i =0 ; i < roads.length; i++){
            char[] roadsArr = roads[i].toCharArray();
            maps[i] = roadsArr.clone();
        }

        Point first = new Point(0, 0);
        Point last = new Point(N-1, M-1);

        visited.put(first, 1);
        q.add(first);
        while(!q.isEmpty()){
            Point now = q.poll();

            for(int i =0 ; i < 4; i ++){
                Point next = now.moveTo(i);

                // 맵을 벗어난 경우 / 이미 방문한 좌표일 경우 / 방문한 좌표가 벽인 경우
                if(!next.isValid(N, M) || next.getMapValue(maps) -'0' == 0 || visited.containsKey(next)){
                    continue;
                }

                if(next.equals(last)){
                    return visited.get(now) + 1;
                }

                q.add(next);
                visited.put(next, visited.get(now)+1);
            }
        }
        return -1;
    }
}
