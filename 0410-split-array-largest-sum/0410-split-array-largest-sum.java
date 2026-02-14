class Solution {
    public int splitArray(int[] nums, int k) {
        int sum = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
            max = Math.max(max, nums[i]);  // Fix: pass nums[i], not nums
        }
        int left = max;     // Fix: use 'left' not 'start'
        int right = sum;    // Fix: use 'right' not 'end'
        
        while(left <= right){
            int mid = left + (right - left)/2;
            if(canSplit(nums, k, mid)){
                right = mid - 1;  // Fix: try smaller max sum
            } else {
                left = mid + 1;    // Fix: need larger max sum
            }
        }
        return left;  // Fix: return left, not start
    }
    
    private boolean canSplit(int[] nums, int k, int maxSum) {
        int subarrays = 1;
        int currentSum = 0;
        
        for (int num : nums) {
            if (currentSum + num <= maxSum) {
                currentSum += num;
            } else {
                subarrays++;
                currentSum = num;
                if (subarrays > k) {
                    return false;
                }
            }
        }
        return true;
    }
}