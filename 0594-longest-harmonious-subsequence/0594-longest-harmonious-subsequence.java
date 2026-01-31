class Solution{
    public int findLHS(int[] nums){
        Arrays.sort(nums);

        int maxLength = 0;
        int prevCount = 1;
        int currCount = 1;
        int prevNum = nums[0];

        for(int i = 1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                currCount++;
            } else {
                prevNum = nums[i-1];
                prevCount = currCount;
                currCount = 1;
            }
            if(nums[i] - prevNum ==1){
                maxLength = Math.max(maxLength,prevCount + currCount);
            }
        }
        return maxLength;
    }
}