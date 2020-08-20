package programmersPaidClass.week1;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class Quest67681Test extends TestCase {

    @Test
    public void test(){
        Quest67681 quest = new Quest67681();
        Assert.assertEquals(1, quest.solution(new int[]{1,2,3,4}));
        Assert.assertEquals(4, quest.solution(new int[]{1,2,7,6,4}));
    }

}