package programmers.ebayTest;

import junit.framework.TestCase;

public class Quest1Test extends TestCase {
    public void test(){
        Quest1 quest1 = new Quest1();
        int[] T = new int[]{5,8,3,7,10,5,4};
        int[][] R = new int[][]{{1,2}, {2,4}, {1,4}, {6,5}, {3,5}, {4,6}};
        assertEquals(35, quest1.solution(T, R, 5));
    }

}