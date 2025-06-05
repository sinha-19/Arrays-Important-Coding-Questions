public class Solution {
    /*
     * Problem: Rotate matrix by 90 degrees clockwise in-place.
     * Approach: Transpose + reverse rows.
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     */
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // Transpose
        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++)
                swap(matrix, i, j, j, i);
        // Reverse each row
        for (int i = 0; i < n; i++)
            reverse(matrix[i]);
    }
    private void swap(int[][] mat, int i, int j, int x, int y) {
        int temp = mat[i][j];
        mat[i][j] = mat[x][y];
        mat[x][y] = temp;
    }
    private void reverse(int[] row) {
        int i = 0, j = row.length - 1;
        while (i < j) {
            int temp = row[i];
            row[i++] = row[j];
            row[j--] = temp;
        }
    }
}
