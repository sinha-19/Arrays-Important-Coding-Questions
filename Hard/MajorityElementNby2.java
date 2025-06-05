public class Solution {
    /*
     * Problem: Find the element that appears more than n/2 times in an array.
     * Approach: Boyer-Moore Voting Algorithm.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public int majorityElement(int[] nums) {
        int count = 0, candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}
