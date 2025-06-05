import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Solution {
    /*
     * Problem: Find all unique quadruplets that sum to a target value.
     * Approach: Sort the array, use two nested loops and two pointers for the remaining two elements.
     * Time Complexity: O(n^3)
     * Space Complexity: O(1) (excluding output list)
     */
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);  // Sort the array to apply two-pointer approach and skip duplicates
        int n = nums.length;
        // Fix the first element
        for (int i = 0; i < n - 3; i++) {
            // Skip duplicate elements for i
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            // Fix the second element
            for (int j = i + 1; j < n - 2; j++) {
                // Skip duplicate elements for j
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int left = j + 1;
                int right = n - 1;
                // Two-pointer approach to find the remaining two elements
                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        // Found a quadruplet matching the target
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        // Skip duplicates for the third element
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        // Skip duplicates for the fourth element
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        left++;  // Move pointers inward after adding the quadruplet
                        right--;
                    } else if (sum < target) {
                        left++;  // Increase sum by moving left pointer right
                    } else {
                        right--; // Decrease sum by moving right pointer left
                    }
                }
            }
        }
        return res;
    }
}
