package programmersPaidClass.week1;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class Quest67684Test extends TestCase {

    @Test
    public void test(){
        Quest67684 quest67684 = new Quest67684();

        Assert.assertEquals(2, quest67684.solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"}));
    }


}