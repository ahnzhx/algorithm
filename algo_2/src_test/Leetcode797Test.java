import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

class Leetcode797Test {

    @Test
    public void test(){
        Leetcode797 lc = new Leetcode797();
        List<List<Integer>> output = new ArrayList<>();
        output.add(Arrays.asList(0,1,3));
        output.add(Arrays.asList(0,2,3));
        assertEquals(output, lc.allPathsSourceTarget(new int[][]{{1,2}, {3}, {3}, {}}));
    }

}