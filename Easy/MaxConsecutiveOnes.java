public class Solution {
    /*
     * Problem: Find the maximum number of consecutive 1s in a binary array.
     * Approach: Traverse array, count current streak of 1s, update max.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public int maxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int current = 0;
        for (int num : nums) {
            if (num == 1) {
                current++;
                maxCount = Math.max(maxCount, current);
            } else {
                current = 0;
            }
        }
        return maxCount;
    }
}
