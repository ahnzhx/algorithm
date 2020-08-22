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

        public Point(Point fromPoint) {
            this.x = fromPoint.x;
            this.y = fromPoint.y;
        }

        public Point movePoint(char direction){
            switch (direction){
                case 'U':
                    this.y++;
                    break;
                case 'D':
                    this.y--;
                    break;
                case 'L':
                    this.x--;
                    break;
                case 'R':
                    this.x++;
                    break;
            }
            return this;
        }

        private boolean isOut(){
            if((this.x > MAX || this.x < MIN) || (this.y > MAX || this.y < MIN)){
                return true;
            }
            return false;
        }

        @Override
        public boolean equals(Object o) {
            Point point = (Point) o;
            return x == point.x &&
                    y == point.y;
        }
    }

    class HistoryPoint {
        private Point fromPoint;
        private Point toPoint;

        public HistoryPoint(Point fromPoint, Point toPoint) {
            this.fromPoint = fromPoint;
            this.toPoint = toPoint;
        }

        @Override
        public boolean equals(Object o) {
            HistoryPoint other = (HistoryPoint) o;
            return other.fromPoint.equals(fromPoint)
                    && other.toPoint.equals(toPoint);
        }
    }


    public int solution(String dirs) {
        char[] dirsArray = dirs.toCharArray();
        int answer = 0;
        Point fromPoint = new Point(0,0);

        for(char direction : dirsArray){
            Point toPoint = new Point(fromPoint);
            toPoint.movePoint(direction);

            if(!toPoint.isOut()){
                if(isFirst(fromPoint, toPoint)){
                    histories.add(new HistoryPoint(fromPoint, toPoint));
                    histories.add(new HistoryPoint(toPoint, fromPoint));
                    answer++;
                }
                fromPoint = toPoint;
            }
        }
        return answer;
    }

    private boolean isFirst(Point fromPoint, Point toPoint){
        HistoryPoint historyPoint = new HistoryPoint(fromPoint, toPoint);
        boolean result = !histories.contains(historyPoint);
        historyPoint = null;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Quest67679().solution("ULURRDLLU"));
        //System.out.println(new Quest67679().solution("LULLLLLLU"));
    }
}
