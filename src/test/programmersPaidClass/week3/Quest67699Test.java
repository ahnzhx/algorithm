package programmersPaidClass.week3;

import junit.framework.TestCase;

public class Quest67699Test extends TestCase {
    public void test(){
        Quest67699 quest67699 = new Quest67699();
        int[][] computers = new int[][]{{1,1,0}, {1,1,0}, {0,0,1}};
        assertEquals(2, quest67699.solution(3, computers));
        int[][] computers2 = new int[][]{{1,1,0}, {1,1,1}, {0,1,1}};
        assertEquals(1 , quest67699.solution(3, computers2));

        int[][] computers3 = new int[][]{{1,0,0}, {0,1,1}, {0,1,1}};
        assertEquals(2 , quest67699.solution(3, computers3));

        int[][] computers4 = new int[][]{{1,0,0, 0}, {0,1,0,1}, {0,0,1, 0}, {0,1,0,1}};
        assertEquals(3 , quest67699.solution(4, computers4));
    }

}