package programmersPaidClass.week2;

import junit.framework.TestCase;


public class Quest67695Test extends TestCase {

    public void test(){
        Quest67695 quest67695 = new Quest67695();
        assertFalse(quest67695.solution(new String[]{"119", "97674223", "1195524421"}));
        assertTrue(quest67695.solution(new String[]{"123", "456", "789"}));
        assertFalse(quest67695.solution(new String[]{"12", "123", "1235", "567", "88"}));
    }

}