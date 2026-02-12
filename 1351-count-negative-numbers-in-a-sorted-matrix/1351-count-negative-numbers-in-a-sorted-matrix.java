class Solution{
    public int countNegatives(int[][] grid){
        //this is the problem that is solved by using two pointers approach
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
        //if i had to solve this problem by another by sing nested loop
        int count = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                if(grid[i][j]>0){//it only count when the condition grid[i][j] is grester tham 0 otherwise it si negative numbers
                    count++;
                }
            }
        }
        return count;
    }
}
