package programmersPaidClass.week3;

import junit.framework.TestCase;

public class Quest67698Test extends TestCase {
    public void test(){
        Quest67698 quest67698 = new Quest67698();
        int[] scoville = new int[]{1,2,3,9,10,12};
        assertEquals(2, quest67698.solution(scoville, 7));
    }


}