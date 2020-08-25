package programmersPaidClass.week2;

import junit.framework.TestCase;

public class Quest67694Test extends TestCase {
    public void test(){
        Quest67694 quest67694 = new Quest67694();
        String[][] clothes = new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        assertEquals(5, quest67694.solution(clothes));
        String[][] clothes2 = new String[][]{{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        assertEquals(3, quest67694.solution(clothes2));
    }

}