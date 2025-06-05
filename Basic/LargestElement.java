public class Solution {
    /*
     * Problem: Find the largest element in the array.
     * Approach: Linear scan through the array, track max element.
     * Time Complexity: O(n) — one pass through array.
     * Space Complexity: O(1) — constant extra space.
     * Important: Works even if all elements are negative.
     */
    public int findLargest(int[] arr) {
        int max = arr[0]; // Initialize max with first element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if current element is greater
            }
        }
        return max; // Return the largest element found
    }
}
