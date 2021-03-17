package algoTest.naverTest.naverFinancial;


import junit.framework.TestCase;
import org.junit.Test;

public class Jgha_test_2Test extends TestCase {

    @Test
    public void test(){
        Jgha_test_2 quest2 = new Jgha_test_2();
        assertEquals("12345", quest2.solution(54321));
        assertEquals("11001", quest2.solution(10011));
        assertEquals("1", quest2.solution(1));
    }

}