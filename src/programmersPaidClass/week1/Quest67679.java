package programmersPaidClass.week1;


import java.util.ArrayList;
import java.util.List;

/**
 * 내가 못 푼 문제.. Point와 HistoryPoint 구현법을 알았다.
 */
public class Quest67679 {

    private static final int MAX = 5;
    private static final int MIN = -5;
    private List<HistoryPoint> histories = new ArrayList<>();

    class Point{
        private int x;
        private int y;

        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    class HistoryPoint {
        private Point fromPoint;
        private Point toPoint;

        public HistoryPoint(int fromX, int fromY, int toX, int toY) {
            this.fromPoint = new Point(fromX, fromY);
            this.toPoint = new Point(toX, toY);
        }

        // 구현해줘야 할까?
        @Override
        public boolean equals(Object o) {
            HistoryPoint other = (HistoryPoint) o;
            return this.fromPoint.x == other.fromPoint.x
                    && this.fromPoint.y == other.fromPoint.y
                    && this.toPoint.x == other.toPoint.x
                    && this.toPoint.y == other.toPoint.y;
        }
    }


    public int solution(String dirs) {
        char[] dirsArray = dirs.toCharArray();
        int answer = 0;
        //시작점
        Point startPoint = new Point(0,0);

        // TODO 2. U, D, L, R
        for(char direction : dirsArray){
            int fromX = startPoint.x;
            int fromY = startPoint.y;
            int toX = fromX;
            int toY = fromY;

            switch (direction){
                case 'U':
                    toY++;
                    break;
                case 'D':
                    toY--;
                    break;
                case 'L':
                    toX--;
                    break;
                case 'R':
                    toX++;
                    break;
            }

            if(!isOut(toX, toY)){
                if(isFirst(fromX, fromY, toX, toY)){
                    histories.add(new HistoryPoint(fromX, fromY,toX, toY));
                    histories.add(new HistoryPoint(toX, toY, fromX, fromY));
                    answer++;
                }
                startPoint.x = toX;
                startPoint.y = toY;
            }
        }
        return answer;
    }

    private boolean isOut(int toX, int toY){
        if((toX > MAX || toX < MIN) || (toY > MAX || toY<MIN)){
            return true;
        }
        return false;
    }
    private boolean isFirst(int fromX, int fromY, int toX, int toY){
        return !histories.contains(new HistoryPoint(fromX, fromY, toX, toY));
    }

    public static void main(String[] args) {
        System.out.println(new Quest67679().solution("ULURRDLLU"));
        //System.out.println(new Quest67679().solution("LULLLLLLU"));
    }
}
