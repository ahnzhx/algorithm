package programmersPaidClass.week3;

import junit.framework.TestCase;

public class Quest67700Test extends TestCase {
    public void test(){
        Quest67700 quest67700 = new Quest67700();
        int dates[] = new int[]{4, 10, 15};
        int supplies[] = new int[]{20, 5, 10};
        assertEquals(2, quest67700.solution(4, dates, supplies, 30));
    }

}