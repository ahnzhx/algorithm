package algoTest.kakao210331;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class Test1Test extends TestCase {
    public void test(){
        Test1 test = new Test1();
        List<String> answer = new ArrayList<>();
        answer.add("Tube");
        List<List<String>> arr = new ArrayList<>();
        List<String> sample1 = new ArrayList<>();
        sample1.add("Apeach");
        sample1.add("Frodo");
        sample1.add("5");





        List<String> sample2 = new ArrayList<>();
        sample2.add("Frodo");
        sample2.add("Apeach");
        sample2.add("3");
        List<String> sample3 = new ArrayList<>();
        sample3.add("Tube");
        sample3.add("Apeach");
        sample3.add("7");
        List<String> sample4 = new ArrayList<>();
        sample4.add("Tube");
        sample4.add("Apeach");
        sample4.add("4");

        List<String> sample5 = new ArrayList<>();
        sample5.add("Tube");
        sample5.add("Apeach");
        sample5.add("2");

        arr.add(sample1);
        arr.add(sample2);
        arr.add(sample3);
        arr.add(sample4);
        arr.add(sample5);

        assertEquals(answer, test.solution(arr));
    }
}