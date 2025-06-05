import java.util.*;
public class Solution {
    /*
     * Problem: Find two indices such that nums[i] + nums[j] = target.
     * Approach: Use HashMap to store (value → index).
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[] { map.get(diff), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {}; // If no solution
    }
}
