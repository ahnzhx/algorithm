package algoTest.naverTest.naverFinancial;

import junit.framework.TestCase;

public class NTest1Test extends TestCase {
    public void test(){
        NTest1 nTest1 = new NTest1();
        assertEquals(6, nTest1.solution(1,8,3,2));
        assertEquals(3, nTest1.solution(2,3,3,2));
        assertEquals(0, nTest1.solution(6,2,4,7));


    }

}