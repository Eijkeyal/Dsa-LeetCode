class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Handle all edge cases
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // Check if matrix has columns
        if (cols == 0) {
            return false;
        }
        
        int start = 0;
        int end = rows * cols - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int row = mid / cols;
            int col = mid % cols;
            int value = matrix[row][col];
            
            if (value == target) {
                return true;
            } else if (value < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return false;
    }
}