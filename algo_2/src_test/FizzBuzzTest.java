import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

class FizzBuzzTest {
    @Test
    public void test(){
        FizzBuzz fb = new FizzBuzz();
        String[] output = new String[]{"1", "2", "Fizz"};
        String[] output2 = new String[]{"1","2","Fizz","4","Buzz"};
        String[] output3 = new String[]{"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"};


        assertEquals(Arrays.asList(output), fb.fizzBuzz(3));
        assertEquals(Arrays.asList(output2), fb.fizzBuzz(5));
        assertEquals(Arrays.asList(output3), fb.fizzBuzz(15));

    }

}