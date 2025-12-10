import org.example.Calc;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest {
    @Test
    public void test () {

        // System.out.println("First Junit run");
        Calc calc = new Calc();
        int actual = calc.divide(10, 5);
        int expectedResult = 3;

        assertEquals(expectedResult, actual);
    }
}
