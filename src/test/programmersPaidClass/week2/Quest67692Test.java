package programmersPaidClass.week2;

import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;


public class Quest67692Test extends TestCase {

    public void test(){
        Quest67692 quest67692 = new Quest67692();
        int[] progresses = new int[]{93,30,55};
        int[] speeds = new int[]{1,30,5};
        int[] answer = new int[]{2,1};
        assertArrayEquals(answer, quest67692.solution(progresses, speeds));
    }
}