class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
      int n = fruits.length;
      boolean[] used = new boolean[n];// Array to track which baskets are already occupied
      int unplaced = 0;
      int quantity = 0;
      for(int i =0; i<n;i++){
        quantity = fruits[i];
        boolean placed = false;

        // Search for leftmost available basket that can hold this fruit
        for(int j = 0; j<n; j++){
            if(!used[j]&& baskets[j]>= quantity){
                used[j] = true;
                placed = true;
                break;// Stop searching - we found the leftmost available basket
            }
        }
        if(!placed){
            unplaced++;//if there is not placed then increase by one
        }
     }
      return unplaced;//return total number of fruits that couldnot be replaced
    }
}