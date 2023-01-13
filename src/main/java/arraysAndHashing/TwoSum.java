package arraysAndHashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
     */
    public int[] solve(int[] nums, int target) {
        Map<Integer, Integer> numToIndexMap = new HashMap<>();

        int[] indices = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndexMap.containsKey(complement)) {
                indices[0] = i;
                indices[1] = numToIndexMap.get(complement);
                return indices;
            }

            numToIndexMap.put(nums[i], i);
        }

        return indices;
    }
}
