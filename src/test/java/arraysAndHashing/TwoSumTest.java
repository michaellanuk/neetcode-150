package arraysAndHashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {
    TwoSum twoSum = new TwoSum();

    @Test
    public void testSolve() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] expected = {1, 0};
        int[] solution = twoSum.solve(nums, target);

        assertArrayEquals(solution, expected);
    }
}
