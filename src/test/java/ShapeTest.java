import org.example.Shapes;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ShapeTest {
    Shapes shape;

    ShapeTest () {
        System.out.println("Test object is created before test...");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all tests");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After all tests");
    }

    @BeforeEach
    public void init () {
        shape = new Shapes();
        System.out.println("Before test");
    }

    @Test
    public void testComputeSquareArea () {
        assertEquals(576, shape.computeSquareArea(24), "Area of square is wrong");
        assertNotEquals(1000, shape.computeSquareArea(24), "Message to dev if task failed");
    }

    @Test
    public void testComputeCircleArea2 () {
        assertEquals(78.5, shape.computeCircleArea(5), () -> "Area of circle is wrong");
    }

    @Test
    public void test () {
        String str = "JUnit";
        assertTrue(str.equals("JUnit"));
        System.out.println("Test finished...");
    }

    @AfterEach
    public void destroy () {
        System.out.println("After test");
    }


}
