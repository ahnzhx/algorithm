package baekjoon;

import junit.framework.TestCase;

public class testTest extends TestCase {
    public void test(){
        test TT = new test();
        String a = "[{()}]";
        String b = "(]";
        String c = "([)]";
        String d = "";
//        assertTrue(TT.isValid(a));
//        assertFalse(TT.isValid(b));
//        assertFalse(TT.isValid(c));
//        assertTrue(TT.isValid(d));

        assertTrue(TT.solution(a));
        assertFalse(TT.solution(b));
        assertFalse(TT.solution(c));
        assertTrue(TT.solution(d));
    }
}