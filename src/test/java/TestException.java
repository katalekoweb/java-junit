import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class TestException {

    SotingArray sotingArray = new SotingArray();

    @Test
    public void testSortingArrayException () {
        /*
        try {
            int[] unsorted = {2,6,8,4};
            int[] sortedArray = sotingArray.sortingArray(unsorted);

            for (int el: sortedArray) {
                System.out.println(el);
            }

            System.out.println("Statement below exception");
            // fail();

        } catch (NullPointerException e) {
            System.out.println("Exception generated");
        }

         */

        int[] unsorted = null;
        assertThrows(NullPointerException.class, () -> sotingArray.sortingArray(unsorted));

    }

    @Test
    public void testArraySortingPerfomance () {
        int[] unsorted = {1,3,7,4};
        assertTimeout(Duration.ofMillis(10), () -> sotingArray.sortingArrayPerfomance(unsorted));
    }
}
