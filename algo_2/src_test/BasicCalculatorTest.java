import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class BasicCalculatorTest {
    @Test
    public void test(){
        BasicCalculator bc = new BasicCalculator();

        assertEquals(23, bc.calculate("(1+(4+5+2)-3)+(6+8)"));
        assertEquals(3, bc.calculate(" 2-1 + 2 "));
        assertEquals(2147483647, bc.calculate("2147483647"));
    }

}