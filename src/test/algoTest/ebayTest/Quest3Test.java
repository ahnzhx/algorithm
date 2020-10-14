package algoTest.ebayTest;

import junit.framework.TestCase;

public class Quest3Test extends TestCase {
    public void test(){
        Quest3 quest3 = new Quest3();
        int[][] products = new int[][]{{10,3,2}, {15,2,5}};
        int[][] products2 = new int[][]{{6,5,1}, {11,3,2}, {7,10,3}};

        assertEquals(48, quest3.solution(2, products));
        assertEquals(120, quest3.solution(3, products2));
    }
}