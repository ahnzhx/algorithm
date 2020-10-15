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

   public static int solution(Map<Integer, List<Integer>> pairMap, int start, int goal){
        List<Integer> endList = pairMap.get(start);
        int min = Integer.MAX_VALUE;
        
        for(Integer end : endList){
        	if(endList.contains(goal)) {
            	min = 1;
            	return min;
            }
            List<Integer> nextList = pairMap.get(end);
            int comparingNum = 1;
            for(Integer next : nextList){
                comparingNum += 1;
                if(next == goal){
                    if(comparingNum < min){
                        min = comparingNum;
                    }
                }

            }
        }
        if (min == Integer.MAX_VALUE) return -1;
        return min;
	}
	
	public static void main(String[] args) {
	     Map<Integer, List<Integer>> pairMap = new HashMap<>();
	     List<Pair> pairList = new ArrayList<>();
	     
	     Scanner sc = new Scanner(System.in);
	     int start = sc.nextInt();
	     int goal = sc.nextInt();
	     
	     int first = sc.nextInt();
	     int next = sc.nextInt();
	     
	     pairList.add(new Pair(first, next));
	     
	     sc.close();
	        	
        List<Integer> endList;
        for(Pair pair : pairList){
            endList = pairMap.get(pair.getStart());
            if(endList == null ){
                endList = new ArrayList<>();
            }
            endList.add(pair.getEnd());
            pairMap.put(pair.getStart(), endList);

        }

        System.out.println(solution(pairMap, first, goal));

    }
}
