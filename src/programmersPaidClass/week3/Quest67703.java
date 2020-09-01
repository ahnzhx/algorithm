package programmersPaidClass.week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Quest67703 {
    private static final int east = +1;
    private static final int west = -1;
    private static final int north = -1;
    private static final int south = 1;

    private Stack<Location> locationQ = new Stack<>();
    private boolean[][] visited ;
    public int solution(int[][] maps) {
        int answer = 0;
        Location robotLoc = new Location(0,0);
        visited = new boolean[maps.length][maps[0].length];
        List<Integer> answerList = new ArrayList<>();
        locationQ.add(robotLoc);
        visited[0][0] = true;

        while(!locationQ.isEmpty()){
            robotLoc = locationQ.pop();
            if(robotLoc.isEastOk(maps)){
                answer++;
            }
            if(robotLoc.isWestOk(maps)){
                answer++;
            }
            if(robotLoc.isNorthOk(maps)){
                answer++;
            }
            if(robotLoc.isSouthOk(maps)){
                answer++;
            }


            if(robotLoc.isArrived(maps)){
                answerList.add(answer);
            }
        }


        return answer;
    }

    class Location{
        private int x;
        private int y;

        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Location moveLocation(int x, int y){
            return new Location(x,y);
        }

        public boolean isEastOk(int[][] maps){
            if(y + east < maps[0].length ){
                if(maps[x][y + east] != 0 ){
                    if(!visited[x][y + east]){
                        locationQ.add(moveLocation(x, y+east));
                        visited[x][y + east] = true;
                        return true;
                    }
                }
            }
            return false;
        }

        public boolean isWestOk(int[][] maps){
            if(y + west >= 0){
                if(maps[x][y + west] != 0 ){
                    if(!visited[x][y + west]){
                        visited[x][y + west] = true;
                        locationQ.add(moveLocation(x, y+west));
                        return true;
                    }
                }
            }
            return false;
        }

        public boolean isNorthOk(int[][] maps){
            if( x + north >= 0 ){
                if(maps[x + north][y] != 0){
                    if(!visited[x + north][y]){
                        visited[x + north][y] = true;
                        locationQ.add(moveLocation(x + north, y));
                        return true;
                    }

                }
            }
            return false;
        }

        public boolean isSouthOk(int[][] maps){
            if(x + south < maps.length){
                if(maps[x + south][y] != 0){
                    if(!visited[x + south][y]){
                        visited[x + south][y] = true;
                        locationQ.add(moveLocation(x + south, y));
                        return true;
                     }
                }
            }
            return false;
        }

        public boolean isArrived(int[][] maps){
            if(x == maps[0].length && y == maps.length)
                return true;
            return false;

        }
    }


}
