package testAlgi;

import junit.framework.TestCase;

public class test2Test extends TestCase {
    public void test(){
        test2 t = new test2();
        assertEquals(2, t.solution("abccbd", new int[]{0,1,2,3,4,5}));
        assertEquals(3, t.solution("aabbcc", new int[]{1,2,1,2,1,2}));
        assertEquals(12, t.solution("aaaa", new int[]{3,4,5,6}));
        assertEquals(0, t.solution("ababa", new int[]{10, 5, 10, 5, 10}));
    }

}