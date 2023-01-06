package arraysAndHashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsDuplicateTest {
    ContainsDuplicate containsDuplicate = new ContainsDuplicate();

    @Test
    public void testTrue() {
        int[] nums = {1, 2, 3, 4, 1};
        assertTrue(containsDuplicate.solve(nums));
    }

    @Test
    public void testFalse() {
        int[] nums = {1, 2, 3, 4, 5};
        assertFalse(containsDuplicate.solve(nums));
    }

    @Test
    public void testEmpty() {
        int[] nums = {};
        assertFalse(containsDuplicate.solve(nums));
    }
}
