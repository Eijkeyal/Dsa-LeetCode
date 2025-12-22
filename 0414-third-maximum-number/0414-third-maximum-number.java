class Solution {
    public int thirdMax(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j] =temp;
                }
            }
        }
        // Count distinct numbers
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                count++;
            }
            if(count == 3){
                return nums[i];
            }
        }
        
        // No third max, return first
        return nums[0];
    }
}