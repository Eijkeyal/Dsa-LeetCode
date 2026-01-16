class Solution {
    public int[] twoSum(int[] nums, int target) {
       for(int i = 0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            //check if the pair sums to the target
            if(nums[i] + nums[j]== target){
                //return the indices of the valid pair
                return new int[] {i,j};
            }
         }
       } 
       // return [-1,-1] if there is no pair found to meet the target value
       return new int[] {-1,-1};
    }
}
