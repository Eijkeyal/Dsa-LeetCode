class Solution {
    public int dominantIndex(int[] nums) {
    //Step 1: first make a copy of original array
     int sorted[] = nums.clone();
     //Step 2: Sort the copied Array
     Arrays.sort(sorted);
     //Step 3: Find the largest Number of a Array
     int largestNumber = sorted[sorted.length-1];
     // Check condition with all numbers
     for(int i = 0; i<nums.length; i++){
     // sTEP 4:Skip if it's the largest number itself
        if(nums[i] == largestNumber) continue;
     //Step 5: check if largest is at least twice this number
        if(largestNumber<2*nums[i]){
            return -1;
        }
     }
     //Step 6: find and return index of largest 
     for(int i = 0; i<nums.length; i++){
        if(nums[i]==largestNumber){
            return i;
        }
     }
     return -1;
    }
}