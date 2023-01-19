import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class RaceCarTest {

    @Test
    public void test(){
        RaceCar rc = new RaceCar();
        assertEquals(2, rc.racecar(3));
        assertEquals(5, rc.racecar(6));
        assertEquals(5, rc.racecar(4));
    }
}