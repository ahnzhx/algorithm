package algoTest.naverTest.naverFinancial;

import junit.framework.TestCase;
import org.junit.Test;

public class Shahn2_test_1Test extends TestCase {
    @Test
    public void test(){
        Shahn2_test_1 shahn = new Shahn2_test_1();
        String[] str1 = new String[]{"Cardiology", "Orthopaedics", "Neurology", "Cardiology", "Orthopaedics", "Cardiology"};
        String[] str2 = new String[]{"Oncology", "Gynaecology", "Orthopaedics", "Oncology", "Gynaecology"};
        String[] str3 = new String[]{"Neurology", "Cardiology", "Oncology"};
        assertEquals(3, shahn.solution(str1));
        assertEquals(2, shahn.solution(str2));
        assertEquals(1, shahn.solution(str3));
    }

}