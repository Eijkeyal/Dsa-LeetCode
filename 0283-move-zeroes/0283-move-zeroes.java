class Solution{
    public void moveZeroes(int[] nums){
        int i = 0;
        int j = 0;// Pointer for the position to place next non-zero
        for(i = 0;i<nums.length; i++){
            if(nums[i] != 0){
                int temp  = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }
}
/*
class Solution {
    public void moveZeroes(int[] nums) {
        for(int i=0; i<nums.length;i++){
            for(int j =0;j<nums.length-i-1;j++){
                if(nums[j]==0){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

    }
}
*/