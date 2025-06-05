public class Solution {
    /*
     * Problem: Left rotate the array by one position.
     * Approach: Store first element, shift others left, place first at end.
     * Time Complexity: O(n) — one pass to shift.
     * Space Complexity: O(1).
     * Important: Works in-place without extra array.
     */
    public void leftRotateByOne(int[] arr) {
        int first = arr[0]; // Save first element
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i]; // Shift elements to the left
        }
        arr[arr.length - 1] = first; // Put first element at end
    }
}
