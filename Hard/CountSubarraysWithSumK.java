import java.util.*;
public class Solution {
    /*
     * Problem: Count the number of subarrays with sum equal to given K.
     * Approach: Use prefix sum and a HashMap to track frequency of sums.
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public int countSubarraysWithSum(int[] nums, int k) {
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1); // Base case: sum = 0 has one count
        int sum = 0, count = 0;
        for (int num : nums) {
            sum += num;
            // If (sum - k) exists in map, there are subarrays that sum to k
            if (prefixSumCount.containsKey(sum - k)) {
                count += prefixSumCount.get(sum - k);
            }
            // Update frequency of current prefix sum
            prefixSumCount.put(sum, prefixSumCount.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
