package programmersPaidClass.week1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

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

        // 구현해줘야 할까?
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
        //시작점
        Point fromPoint = new Point(0,0);

        // TODO 2. U, D, L, R
        for(char direction : dirsArray){
            Point toPoint = new Point(fromPoint.x, fromPoint.y);
            switch (direction){
                case 'U':
                    toPoint.y++;
                    break;
                case 'D':
                    toPoint.y--;
                    break;
                case 'L':
                    toPoint.x--;
                    break;
                case 'R':
                    toPoint.x++;
                    break;
            }

            if(!isOut(toPoint)){
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

    private boolean isOut(Point toPoint){
        if((toPoint.x > MAX || toPoint.x < MIN) || (toPoint.y > MAX || toPoint.y < MIN)){
            return true;
        }
        return false;
    }
    private boolean isFirst(Point fromPoint, Point toPoint){
        return !histories.contains(new HistoryPoint(fromPoint, toPoint));
    }

    public static void main(String[] args) {
        System.out.println(new Quest67679().solution("ULURRDLLU"));
        //System.out.println(new Quest67679().solution("LULLLLLLU"));
    }
}
