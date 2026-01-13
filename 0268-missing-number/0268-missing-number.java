class Solution {
    public int missingNumber(int[] nums) {
        // For ascending order
        Arrays.sort(nums);
    // applying Binary Search algorithim
        int start = 0;
        int end = nums.length;
         while(start < end){
            int mid = start + (end - start)/2;
            if(nums[mid]==mid){
                //missing number is on the right side
                start = mid+1;
            } else {
                end = mid;
            }
         }
         return start;
    }
}