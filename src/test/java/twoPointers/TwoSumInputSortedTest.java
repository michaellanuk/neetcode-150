package twoPointers;

import arraysAndHashing.TwoSumInputSorted;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumInputSortedTest {
    TwoSumInputSorted twoSumInputSorted = new TwoSumInputSorted();

    @Test
    public void testSolve() {
        int[] numbers = {1, 3, 4, 5, 7, 10, 11};
        int target = 9;

        assertArrayEquals(twoSumInputSorted.solve(numbers, target), new int[] {3, 4});
    }
}
