package programmersPaidClass.week2;

import junit.framework.TestCase;
import org.junit.Assert;

public class Quest67689Test extends TestCase {
    public void test(){
        Quest67689 quest67689 = new Quest67689();

        Assert.assertTrue(quest67689.solution("()()"));
        Assert.assertTrue(quest67689.solution("(())()"));
        Assert.assertFalse(quest67689.solution(")()("));
        Assert.assertFalse(quest67689.solution("(()("));

    }


}