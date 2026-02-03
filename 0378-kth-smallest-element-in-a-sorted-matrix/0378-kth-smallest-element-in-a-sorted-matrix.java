class Solution {
    public int kthSmallest(int[][] matrix, int k) {
    ArrayList<Integer> allElements = new ArrayList<>();// put all 2D array into arraylist
    for(int i = 0; i<matrix.length; i++){
        for(int j=0;j<matrix.length;j++){
            allElements.add(matrix[i][j]);
        }
    }
    Collections.sort(allElements);
        // Step 3: Get the kth smallest element
        // k=1 means 1st smallest (index 0)
        // k=8 means 8th smallest (index 7)
    return allElements.get(k-1);
    }
}