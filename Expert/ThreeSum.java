import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Solution {
    /*
     * Problem: Find all unique triplets in the array which gives the sum of zero.
     * Approach: Sort the array and use two-pointer technique to find pairs for each fixed element.
     * Time Complexity: O(n^2)
     * Space Complexity: O(1) (excluding output list)
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the array
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for the first element
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // Skip duplicates for second and third elements
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // Increase sum
                } else {
                    right--; // Decrease sum
                }
            }
        }
        return result;
    }
}
