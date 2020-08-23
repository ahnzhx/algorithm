package programmersPaidClass.week2;

import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;


public class Quest67691Test extends TestCase {

    public void test(){
        Quest67691 quest67691 = new Quest67691();
        assertArrayEquals(new int[]{4, 3, 1, 1, 0}, quest67691.solution(new int[]{1, 2, 3, 2, 3}));
    }

}