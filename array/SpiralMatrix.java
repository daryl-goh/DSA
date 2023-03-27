class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         // Create an ArrayList to store the spiral order traversal of the matrix
        List<Integer> spiralList = new ArrayList<>();

        // Get the number of rows and columns in the matrix
        int m = matrix.length;
        int n = matrix[0].length;

        // Initialize pointers to define the boundaries of the spiral
        int left = 0;
        int right = n - 1;
        int up = 0;
        int down = m - 1;

        // Traverse the matrix in a spiral order
        while (spiralList.size() < n * m) {

            // Traverse the top row from left to right
            for (int j = left; j <= right && spiralList.size() < n*m; j++)  {
                spiralList.add(matrix[up][j]);
            }

            // Traverse the last column from top to bottom
            for (int i = up + 1; i <= down - 1 && spiralList.size() < n*m; i++) {
                spiralList.add(matrix[i][right]);
            }

            // Traverse the last row from right to left
            for (int j = right; j >= left && spiralList.size() < n*m; j--) {
                spiralList.add(matrix[down][j]);
            }

            // Traverse the first column from bottom to top
            for (int i = down - 1; i >= up + 1 && spiralList.size() < n*m; i--) {
                spiralList.add(matrix[i][left]);
            }

            // Update the pointers to define the boundaries of the remaining sub-matrix
            left++;
            right--;
            up++;
            down--;
        }
        // Return the spiral order traversal of the matrix
        return spiralList;
    } 
}