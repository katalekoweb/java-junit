import org.example.ReverseString;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseStringTest {
    @Test
    public void test () {
        ReverseString reverseString = new ReverseString();
        String actual = reverseString.reverseString("Java");

        String expected = "avaJ";
        assertEquals(expected, actual);
    }
}
