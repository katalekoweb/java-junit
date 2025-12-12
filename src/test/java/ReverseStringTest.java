import org.example.ReverseString;
import org.junit.Test;
// import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseStringTest {
    ReverseString reverseString = new ReverseString();

    @Test
    public void test () {
        assertEquals("avaJ", reverseString.reverseString("Java"));
        assertEquals("neilA", reverseString.reverseString("Alien"));
    }

    @Test
    public void testReverseStringMultipleWords () {
        assertEquals("ysae s avaJ", reverseString.reverseString("Java is easy"));
    }
}
