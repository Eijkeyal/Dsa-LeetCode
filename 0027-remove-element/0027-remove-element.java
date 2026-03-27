class Solution {
    public int removeElement(int[] nums, int val) {
        /*
        int i = 0;
        int k = 0;
        for(i = 0; i<nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
        */
        //Initialize two pointer
        int i = 0;
        int k = 0;
        for(i = 0; i<nums.length; i++){
            // If the current element is NOT the one we want to remove
            if(nums[i] != val){
                // Move the valid element to the 'k' position
                nums[k] = nums[i];
                // Increment k to prepare for the next valid element
                k++;
            }
        }
        return k;
    }
}