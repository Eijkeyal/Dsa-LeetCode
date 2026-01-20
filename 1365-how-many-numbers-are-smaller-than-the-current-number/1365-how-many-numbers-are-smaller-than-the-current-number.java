class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int result [] = new int[n];// create result array 
        for(int i = 0;i<n;i++){
            int count = 0;// reset count for each element
            for(int j = 0;j<n; j++){
                if(i!=j && nums[j]<nums[i]){
                    count++;
                }
            }
            result[i] = count;// store count for current element
        }
       
        return result;
    }
}