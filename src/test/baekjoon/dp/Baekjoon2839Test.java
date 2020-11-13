package baekjoon.dp;

import junit.framework.TestCase;

public class Baekjoon2839Test extends TestCase {
    public void test(){
        Baekjoon2839 b = new Baekjoon2839();
//        assertEquals(4, b.solution(18));
        assertEquals(-1, b.solution(4));
        assertEquals(2, b.solution(6));
        assertEquals(3, b.solution(9));
        assertEquals(3, b.solution(11));
    }

}