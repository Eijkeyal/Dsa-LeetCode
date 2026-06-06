class Solution {
    public int[] applyOperations(int[] nums) {
       //using fast & slow pointers
       int slow = 0;
       for(int fast = 0;fast<nums.length;fast++){
        if(fast<nums.length -1 && nums[fast] == nums[fast + 1]){
            nums[fast] = nums[fast] * 2;
            nums[fast + 1] = 0;
        }
        //move non-zero elements to the end
        if(nums[fast]!=0){
            int temp = nums[slow];
            nums[slow] = nums[fast];
            nums[fast] = temp;
            slow++;
        }
       } 
       return nums;
    }
}