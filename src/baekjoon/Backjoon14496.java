package baekjoon;

import java.util.List;
import java.util.Map;

public class Backjoon14496 {
    static class Pair{
        private int start;
        private int end;

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }

        public Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public int solution(Map<Integer, List<Integer>> pairMap, int start, int goal){
        List<Integer> endList = pairMap.get(start);
        int min = Integer.MAX_VALUE;
        for(Integer end : endList){
            List<Integer> nextList = pairMap.get(end);
            int comparingNum = 1;
            for(Integer next : nextList){
                comparingNum += 1;
                if(next == goal){
                    comparingNum += 1;
                    if(comparingNum < min){
                        min = comparingNum;
                    }
                }

            }
        }
        if (min == Integer.MAX_VALUE) return -1;
        return min;
    }
}
