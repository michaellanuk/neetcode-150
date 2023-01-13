package binarySearch;

public class BinarySearch {

    /*
    Given an array of integers nums which is sorted in ascending order,
    and an integer target, write a function to search target in nums.
    If target exists, then return its index. Otherwise, return -1.
    You must write an algorithm with O(log n) runtime complexity.
     */
    public int solve(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                // search left
                right = mid - 1;
            } else {
                // search right;
                left = mid + 1;
            }
        }

        return -1;
    }
}
