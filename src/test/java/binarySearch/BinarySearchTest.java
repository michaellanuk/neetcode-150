package binarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    BinarySearch binarySearch = new BinarySearch();

    @Test
    public void testExists() {
        int[] nums = {1, 3, 4, 6, 7};
        int target = 6;
        assertEquals(binarySearch.solve(nums, target), 3);
    }

    @Test
    public void testDoesNotExist() {
        int[] nums = {1, 3, 4, 6, 7};
        int target = 5;
        assertEquals(binarySearch.solve(nums, target), -1);
    }
}
