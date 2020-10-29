package programmers.dynamicProgramming;

import junit.framework.TestCase;

public class Quest43105Test extends TestCase {
    public void test(){
        Quest43105 quest43105 = new Quest43105();
        assertEquals(30, quest43105.solution(new int[][]{{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}}));
    }

}