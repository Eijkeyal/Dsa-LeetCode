class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       if (matrix == null || matrix.length==0 || matrix[0].length==0){
        return false;
       } 
       int rows = matrix.length;
       int cols = matrix[0].length;

        // start from top right corner
       int row = 0;
       int col = cols-1;

       while(row<rows && col>=0){
        int value = matrix[row][col];
        if(value == target){
            return true;
        } else if(value>target){
            /*if current value is greater than target, all values in this column below also greater so we, move left */
            col--;
        } else{
            /* if current value is less than target, all values in this column before are also greater, so move down */
            row++;
        }
     }
    return false;
    }
}