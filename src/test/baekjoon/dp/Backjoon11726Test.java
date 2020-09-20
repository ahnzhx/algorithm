package baekjoon.dp;

import junit.framework.TestCase;

public class Backjoon11726Test extends TestCase {

    public void test(){
        Backjoon11726 backjoon11726 = new Backjoon11726();
        assertEquals(2, backjoon11726.solution(2));
        assertEquals(55, backjoon11726.solution(9));
    }

}