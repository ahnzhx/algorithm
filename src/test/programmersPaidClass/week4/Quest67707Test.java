package programmersPaidClass.week4;

import junit.framework.TestCase;

public class Quest67707Test extends TestCase {

    public void test(){
        Quest67707 quest67707 = new Quest67707();
        int lost[] = new int[]{2,4};
        int lost2[] = new int[]{3};
        int lost3[] = new int[]{2,3};

        int reverse[] = new int[]{1,3,5};
        int reverse2[] = new int[]{3};
        int reverse3[] = new int[]{1};


        assertEquals(5, quest67707.solution(5, lost, reverse));
        assertEquals(4, quest67707.solution(5, lost, reverse2));
        assertEquals(2, quest67707.solution(3, lost3, reverse3));

    }

}