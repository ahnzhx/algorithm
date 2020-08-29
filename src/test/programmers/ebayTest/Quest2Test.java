package programmers.ebayTest;

import junit.framework.TestCase;

public class Quest2Test extends TestCase {
    public void test(){
        Quest2 quest2 = new Quest2();
        assertEquals(5, quest2.solution(2,2,2));
        assertEquals(-1, quest2.solution(2,2,1));
    }

}