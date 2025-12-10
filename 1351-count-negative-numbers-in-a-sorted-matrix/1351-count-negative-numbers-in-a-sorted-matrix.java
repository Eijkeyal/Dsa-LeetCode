class Solution{
    public int countNegatives(int[][] grid){
        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        int row =rows -1;
        int col = cols-1;
        while(row >=0 && col>=0){
            if(grid[row][col]<0){
                count++;
                //move left in same row
                col--;
                if(col<0){
                    row--;
                    col = cols-1;
                }
            }else{
                row--;
                col = cols-1;
            }
        }
        return count;
    }
}