package baekjoon;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Backjoon14496Test extends TestCase {
    public void test(){
        Backjoon14496 backjoon14496 = new Backjoon14496();
        Map<Integer, Integer> pairMap = new HashMap<>();
        pairMap.put(4,4);
        pairMap.put(1,3);
        pairMap.put(1,4);
        pairMap.put(3,2);
        pairMap.put(4,2);

        assertEquals(2, backjoon14496.solution(pairMap,1,2));
    }

}