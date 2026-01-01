class Solution {
    public int[] sortArrayByParity(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j =0;j<nums.length-i-1;j++){
                if(nums[j]%2==1 && nums[j+1]%2==0){// odd digits olaced  on left and een on right hand side 
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }
}