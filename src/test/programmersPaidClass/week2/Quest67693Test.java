package programmersPaidClass.week2;

import junit.framework.TestCase;

public class Quest67693Test extends TestCase {
    public void test(){
        Quest67693 quest67693 = new Quest67693();
        assertEquals(8, quest67693.solution(2, 10, new int[]{7,4,5,6}));
        assertEquals(101, quest67693.solution(100, 100, new int[]{10}));
        assertEquals(110, quest67693.solution(100, 100, new int[]{10,10,10,10,10,10,10,10,10,10}));
    }

}