public class Solution {
    /*
     * Problem: Count the number of inversions in the array.
     * Approach: Modified merge sort.
     * Time Complexity: O(n log n)
     * Space Complexity: O(n)
     */
    public int countInversions(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
    private int mergeSort(int[] nums, int left, int right) {
        int count = 0;
        if (left < right) {
            int mid = left + (right - left) / 2;
            count += mergeSort(nums, left, mid);
            count += mergeSort(nums, mid + 1, right);
            count += merge(nums, left, mid, right);
        }
        return count;
    }
    private int merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0, count = 0;
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
                count += (mid - i + 1); // Count inversions
            }
        }
        while (i <= mid) temp[k++] = nums[i++];
        while (j <= right) temp[k++] = nums[j++];
        System.arraycopy(temp, 0, nums, left, temp.length);
        return count;
    }
}
