class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        for(int i = 0;i<n;i++){
            int count = 0;//count how many times nums[i] appears
            //count the occurences of nums[i]
            for(int j = 0;j<n;j++){
                if(nums[j] == nums[i]){
                    count++;
                }
            }
            //chrck if it's majority (more than n/2 times)
            if(count>n/2){
                return nums[i];// Return the Element, not the count
            }
        }
        return -1;// should never reach here
    }
}