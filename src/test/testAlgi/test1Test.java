package testAlgi;

import junit.framework.TestCase;

public class test1Test extends TestCase {
    public void test(){
        test1 t = new test1();
        assertEquals("SSSML", t.solution("MSSLS"));
        assertEquals("SMLL", t.solution("LLMS"));
        assertEquals("SSM", t.solution("SMS"));
    }

}