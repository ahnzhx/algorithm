package programmers.ebayTest;

import junit.framework.TestCase;

public class Quest4Test extends TestCase {
    public void test(){
        Quest4 quest4 = new Quest4();
        int[] cards = new int[]{1,4,6};
        int[] cards2 = new int[]{1,2,5};
        assertEquals(2, quest4.solution(8, cards));
        assertEquals(5, quest4.solution(18, cards2));
    }

}