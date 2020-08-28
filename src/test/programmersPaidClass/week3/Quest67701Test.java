package programmersPaidClass.week3;

import junit.framework.TestCase;

public class Quest67701Test extends TestCase {
    public void test(){
        Quest67701 quest67701 = new Quest67701();
        int[] numbers = new int[]{1,1,1,1,1};
        assertEquals(5, quest67701.solution(numbers, 3));
    }

}