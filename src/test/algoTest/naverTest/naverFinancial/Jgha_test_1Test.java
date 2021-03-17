package algoTest.naverTest.naverFinancial;

import junit.framework.TestCase;
import org.junit.Test;


public class Jgha_test_1Test extends TestCase {

    @Test
    public void test(){
        Jgha_test_1 jghaTest1 = new Jgha_test_1();
        assertEquals(2, jghaTest1.solution(new int[]{1,4,1}, new int[]{1,5,1}));
        assertEquals(3, jghaTest1.solution(new int[]{4, 4,2,4}, new int[]{5, 5, 2, 5}));
        assertEquals(2, jghaTest1.solution(new int[]{2,3,4,2}, new int[]{2,5,7,2}));
    }

}