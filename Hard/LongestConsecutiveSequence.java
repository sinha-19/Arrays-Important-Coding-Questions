import java.util.*;
public class Solution {
    /*
     * Problem: Find the length of the longest consecutive sequence in an unsorted array.
     * Approach: Use a HashSet to allow O(1) lookups and identify the start of sequences.
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longestStreak = 0;
        for (int num : nums) {
            // Only start sequence if num - 1 is not in set
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }
}
