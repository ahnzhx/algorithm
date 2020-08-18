package programmersPaidClass.week1.test;


import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import programmersPaidClass.week1.Quest67680;

public class Quest67680Test extends TestCase {
    // 대체 constructor는 왜 만들어주는겨~~?~~?
    public Quest67680Test() {
    }

    public Quest67680Test(String name) {
        super(name);
    }

    @Test
    public void testSolution(){
        Quest67680 quest67680 = new Quest67680();

        Assert.assertArrayEquals(new int[]{3,3},
                quest67680.solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"}));

        Assert.assertArrayEquals(new int[]{0,0},
                quest67680.solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"}));

        Assert.assertArrayEquals(new int[]{1, 3},
                quest67680.solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"}));


    }

}