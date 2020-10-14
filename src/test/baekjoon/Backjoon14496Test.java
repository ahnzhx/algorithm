package baekjoon;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Backjoon14496Test extends TestCase {
    public void test(){
        Backjoon14496 backjoon14496 = new Backjoon14496();
        Map<Integer, List<Integer>> pairMap = new HashMap<>();
        List<Backjoon14496.Pair> pairList = new ArrayList<>();
        pairList.add(new Backjoon14496.Pair(4,4));
        pairList.add(new Backjoon14496.Pair(1,3));
        pairList.add(new Backjoon14496.Pair(1,4));
        pairList.add(new Backjoon14496.Pair(3,2));
        pairList.add(new Backjoon14496.Pair(4,2));

        List<Integer> endList;
        for(Backjoon14496.Pair pair : pairList){
            endList = pairMap.get(pair.getStart());
            if(endList == null ){
                endList = new ArrayList<>();
            }
            endList.add(pair.getEnd());
            pairMap.put(pair.getStart(), endList);

        }

        assertEquals(2, backjoon14496.solution(pairMap, 1,2));

    }

}