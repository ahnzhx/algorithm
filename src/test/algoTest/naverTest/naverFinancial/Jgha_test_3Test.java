package algoTest.naverTest.naverFinancial;

import junit.framework.TestCase;

public class Jgha_test_3Test extends TestCase {
    public void test(){
        int[] A = new int[]{-6, -91, 1011, -100, 84, -22, 0, 1, 473};
        int[] B = new int[]{-6, -91, -100, 84, -22, 0, 1, 473};
        Jgha_test_3 jgha_test_3 = new Jgha_test_3();
        assertEquals(1, jgha_test_3.solution(A));
        assertEquals(7, jgha_test_3.solution(B));
    }

}