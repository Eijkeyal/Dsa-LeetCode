class Solution {
    public int maxSubArray(int[] nums) {
       int currentSum = nums[0];
       int maxSum = nums[0];
       for(int i=1;i<nums.length;i++){
        //either continue with the current subarray, or start new subarray
        currentSum = Math.max(nums[i],currentSum + nums[i]);
        // update maximum sum
        maxSum = Math.max(maxSum, currentSum);
       } 
       return maxSum;
    }
}