package algoTest.naverTest.naverFinancial;

import junit.framework.TestCase;

public class NTest2Test extends TestCase {
    public void test(){
        NTest2 ntest2 = new NTest2();
        assertEquals(1, ntest2.solution(new int[]{0,1,1,1,0,1,1,1,0,1}));
        assertEquals(-1, ntest2.solution(new int[]{0,0}));
        assertEquals(4, ntest2.solution(new int[]{0,1,0,0,1,1}));
        assertEquals(3, ntest2.solution(new int[]{1,1,0,1,1,1,0,0,1,1,1}));
        assertEquals(0, ntest2.solution(new int[]{1,1}));
        assertEquals(0, ntest2.solution(new int[]{1}));
        assertEquals(3, ntest2.solution(new int[]{0,0,0,-1}));

    }
}