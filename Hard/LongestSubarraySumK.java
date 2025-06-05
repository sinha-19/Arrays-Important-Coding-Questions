import java.util.*;
public class Solution {
    /*
     * Problem: Find longest subarray with given sum K (positives + negatives).
     * Approach: Use prefix sum and a HashMap to store the earliest index of each prefix sum.
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public int longestSubarrayWithSumK(int[] nums, int k) {
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        int sum = 0, maxLength = 0;
        // Handle the case when prefix sum equals k at index 0
        prefixSumMap.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (prefixSumMap.containsKey(sum - k)) {
                maxLength = Math.max(maxLength, i - prefixSumMap.get(sum - k));
            }
            // Store the first occurrence of each prefix sum
            prefixSumMap.putIfAbsent(sum, i);
        }
        return maxLength;
    }
}
