package programmersPaidClass.week3;

import junit.framework.TestCase;

public class Quest67703Test extends TestCase {

    public void test(){
        Quest67703 quest67703 = new Quest67703();
        int[][] maps = new int[][]{{1,0,1,1,1}, {1,0,1,0,1}, {1,0,1,1,1}, {1,1,1,0,1}, {0,0,0,0,1}};
        int[][] maps2 = new int[][]{{1,0,1,1,1}, {1,0,1,0,1}, {1,0,1,1,1}, {1,1,1,0,0}, {0,0,0,0,1}};
        assertEquals(11, quest67703.solution(maps));
        assertEquals(-1, quest67703.solution(maps2));
    }

}