import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TestArrays {

    @Test
    public void testing () {
        int[] expected = {2,4,5,8};
        int[] actual = {4,2,5,8};

        Arrays.sort(actual); // 2 ,4,5,8

        assertArrayEquals(expected, actual); // checks the values
        // assertEquals(expected, actual); // checks the reference
    }
    
}
