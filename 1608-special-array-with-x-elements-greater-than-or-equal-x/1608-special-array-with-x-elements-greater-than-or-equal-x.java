class Solution {
    public int specialArray(int[] nums) {
       Arrays.sort(nums);
       int n = nums.length;
       int start = 0;
       int end = n;
         
        // Binary search for x from 0 to n
        // x can't be greater than n because we can't have more than n numbers
        // that are >= x in an array of length n
       while(start<=end){
        int mid = start + (end - start)/2;
        //count how many numbers in the array are >= candiate x
        int count = countGreaterOfEqual(nums,mid);
        //check if this candiate satisfies the special conditions 
        if(count==mid){
            return mid;// found the x
        }else if(count>mid){
            start = mid + 1;
        }else{
            end = mid -1;
        }
       }
       return -1; // no speial x found
    }
        /**
     * Helper method to count how many numbers in the array are >= target
     * @param nums The sorted array
     * @param target The value to compare against
     * @return The count of numbers >= target
     */
    //Helper Methods to count Numbers >= target
    private int countGreaterOfEqual(int[] nums, int target){
        int count = 0;
        for(int num:nums){
            if(num>=target){
                count++;
            }
        }
        return count;
    }
}