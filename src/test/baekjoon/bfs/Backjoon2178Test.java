package baekjoon.bfs;

import junit.framework.TestCase;

public class Backjoon2178Test extends TestCase {
    public void test(){
        Backjoon2178 backjoon2178 = new Backjoon2178();
        String[] roads = new String[]{"101111","101010","101011","111011"};
        assertEquals(15, backjoon2178.solution(roads));

        String[] roads2 = new String[]{"110110", "110110", "111101", "111111"};
        assertEquals(9, backjoon2178.solution(roads2));

        String[] roads3 = new String[]{"1011101110111011101110111","1110111011101110111011101"};
        assertEquals(38, backjoon2178.solution(roads3));

        String[] roads4 = new String[]{"1011111", "1110001","1000001","1000001","1000001","1000001","1111111"};
        assertEquals(13, backjoon2178.solution(roads4));
    }

}