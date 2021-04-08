package stackAndQueues;

import junit.framework.TestCase;

public class CodingTestTest extends TestCase {

    public void test(){
        CodingTest codingTest = new CodingTest();
        assertTrue(codingTest.solution("hello", "llohe"));
        assertFalse(codingTest.solution("hello", "morning"));
    }

}