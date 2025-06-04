public class Solution {
    /*
     * Problem: Check if the array is sorted in non-decreasing order.
     * Approach: Compare each element with the previous one.
     * Time Complexity: O(n) — one pass.
     * Space Complexity: O(1).
     * Important: Returns true for empty or single-element arrays.
     */
    public boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false; // Order violated, array not sorted
            }
        }
        return true; // Array is sorted
    }
}
