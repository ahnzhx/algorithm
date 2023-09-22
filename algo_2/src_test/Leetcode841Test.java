import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


class Leetcode841Test {

    @Test
    public void test(){
        Leetcode841 lc = new Leetcode841();
        List<List<Integer>> input1 = new ArrayList<>();
        input1.add(List.of(1));
        input1.add(List.of(2));
        input1.add(List.of(3));
        input1.add(List.of());
        assertEquals(true, lc.canVisitAllRooms(input1));

        List<List<Integer>> input2 = new ArrayList<>();
        input2.add(Arrays.asList(1,3));
        input2.add(Arrays.asList(3,0,1));
        input2.add(Arrays.asList(2));
        input2.add(Arrays.asList(0));
        assertEquals(false, lc.canVisitAllRooms(input2));
    }

}