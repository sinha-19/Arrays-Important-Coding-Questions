public class Solution {
    /*
     * Problem: Find index of target in array using linear search.
     * Approach: Iterate through array and compare elements.
     * Time Complexity: O(n) — scan array once.
     * Space Complexity: O(1).
     * Important: Returns -1 if target not found.
     */
    public int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Found target at index i
            }
        }
        return -1; // Target not found
    }
}
