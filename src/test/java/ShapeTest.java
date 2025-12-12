import org.example.Shapes;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {
    Shapes shape = new Shapes();

    @Test
    public void testComputeSquareArea () {


        assertEquals(576, shape.computeSquareArea(24), "Area of square is wrong");
        assertNotEquals(1000, shape.computeSquareArea(24), "Message to dev if task failed");
    }

    @Test
    public void testComputeCircleArea2 () {
        assertEquals(78.5, shape.computeCircleArea(5), () -> "Area of circle is wrong");
    }
}
