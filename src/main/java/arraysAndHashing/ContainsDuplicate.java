package arraysAndHashing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public ContainsDuplicate() {};

    /*
    Given an integer array nums, return true if any value appears at
    least twice in the array, and return false if every element is distinct.
     */
    public boolean solve(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return false;
        }

        Set<Integer> numsSet = new HashSet<>();

        for (int n : nums) {
            if (numsSet.contains(n)) {
                return true;
            }

            numsSet.add(n);
        }

        return false;
    }
}
