package baekjoon;

import algoTest.hyperConnect.Brackets;
import junit.framework.TestCase;

public class testBrackets extends TestCase {
    public void test(){
        Brackets TT = new Brackets();
        String a = "[{()}]";
        String b = "(]";
        String c = "([)]";
        String d = "";
        assertTrue(TT.isValid(a));
        assertFalse(TT.isValid(b));
        assertFalse(TT.isValid(c));
        assertTrue(TT.isValid(d));
    }
}