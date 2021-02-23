package algoTest.naverTest.naverFinancial;

import junit.framework.TestCase;

public class DemoTestTest extends TestCase {

    public void test(){
        DemoTest demoTest = new DemoTest();
        assertEquals(5, demoTest.solution(new int[]{1,3,6,4,1,2}));
        assertEquals(4, demoTest.solution(new int[]{1,2,3}));
        assertEquals(1, demoTest.solution(new int[]{-1, -3}));
    }
}