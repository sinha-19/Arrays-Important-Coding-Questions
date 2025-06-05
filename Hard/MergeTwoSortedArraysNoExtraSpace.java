public class Solution {
    /*
     * Problem: Merge two sorted arrays without using extra space.
     * Approach: Use gap method (Shell Sort idea).
     * Time Complexity: O((n + m) log(n + m))
     * Space Complexity: O(1)
     */
    public void merge(int[] arr1, int[] arr2, int n, int m) {
        int gap = (int) Math.ceil((double)(n + m) / 2);
        while (gap > 0) {
            int i = 0, j = gap;
            while (j < n + m) {
                int val1 = (i < n) ? arr1[i] : arr2[i - n];
                int val2 = (j < n) ? arr1[j] : arr2[j - n];
                if (val1 > val2) {
                    if (i < n && j < n) {
                        int temp = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = temp;
                    } else if (i < n) {
                        int temp = arr1[i];
                        arr1[i] = arr2[j - n];
                        arr2[j - n] = temp;
                    } else {
                        int temp = arr2[i - n];
                        arr2[i - n] = arr2[j - n];
                        arr2[j - n] = temp;
                    }
                }
                i++;
                j++;
            }
            if (gap == 1) break;
            gap = (int) Math.ceil((double) gap / 2);
        }
    }
}
