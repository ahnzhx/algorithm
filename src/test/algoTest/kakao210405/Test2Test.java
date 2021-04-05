package algoTest.kakao210405;

import junit.framework.TestCase;
import org.junit.Test;

public class Test2Test extends TestCase {
    @Test
    public void test(){
        Test2 test = new Test2();
        int[][] needs = {{1,0,0}, {1,1,0}, {1,1,0}, {1,0,1}, {1,1,0},{0,1,1}};
        assertEquals(4, test.solution(needs, 2));
    }

}