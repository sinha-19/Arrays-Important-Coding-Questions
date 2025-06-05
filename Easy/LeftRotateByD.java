public class Solution {
    /*
     * Problem: Left rotate the array by D places.
     * Approach: Reverse parts of the array (three-step reverse algorithm).
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public void leftRotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }
    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
}
