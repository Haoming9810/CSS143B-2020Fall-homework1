import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test {

    // Example test
    // Okay to change
    @Test
    public void testBubbleSort() {

        int input[][] = {
                {},
                {1, 3, 6, 4},
                {2, 1, 7},
                {2, 3, 5, 4, 1}};
        int expected[][] = {
                {},
                {1, 3, 4, 6},
                {1, 2, 7},
                {1, 2, 3, 4, 5}};
        for (int i = 0; i < input.length; i++) {
            Problem2.bubbleSort(input[i]);
            assertArrayEquals(expected[i], input[i]);


        }

    }
}