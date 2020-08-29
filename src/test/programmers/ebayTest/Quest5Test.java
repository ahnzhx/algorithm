package programmers.ebayTest;

import junit.framework.TestCase;

public class Quest5Test extends TestCase {
    public void test(){
        Quest5 quest5 = new Quest5();
        int[][] simulation_data = new int[][]{{0,3}, {2,5}, {4,2}, {5,3}};
        int[][] simulation_data2 = new int[][]{{2,3}, {5,4}, {6,3}, {7,4}};
        assertEquals(1, quest5.solution(2, simulation_data));
        assertEquals(8, quest5.solution(1, simulation_data2));
    }

}