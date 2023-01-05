import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class RomanToIntegerTest {

    @Test
    public void test(){
        RomanToInteger rti = new RomanToInteger();
        assertEquals(3, rti.romanToInt("III"));
        assertEquals(58, rti.romanToInt("LVIII"));
        assertEquals(1994, rti.romanToInt("MCMXCIV"));
    }
}