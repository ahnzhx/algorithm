package programmersPaidClass.week2;

import junit.framework.TestCase;
import org.junit.Assert;

public class Quest67690Test extends TestCase {

    public void test(){
        Quest67690 quest67690 = new Quest67690();

        Assert.assertEquals("leo",
                quest67690.solution(new String[]{"leo", "kiki", "eden"},
                                    new String[]{"eden", "kiki"}));

        Assert.assertEquals("vinko",
                quest67690.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
                        new String[]{"josipa", "filipa", "marina", "nikola"}));

        Assert.assertEquals("mislav",
                quest67690.solution(new String[]{"mislav", "stanko", "mislav", "ana"},
                        new String[]{"stanko", "ana", "mislav"}));

    }

}