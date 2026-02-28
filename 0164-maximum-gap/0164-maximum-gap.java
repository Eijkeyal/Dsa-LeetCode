class Solution {
    public int maximumGap(int[] nums) {
        //Step 1: Sort the array
        Arrays.sort(nums);
        //Step 2: Initialize both gap and maxGap
        int gap = 0;
        int maxGap = 0;
        for(int i = 0;i<nums.length -1; i++){
            //Step 3: Calculate the gap between nearest nums[i] and nums[i + 1]
            gap = nums[i + 1] - nums[i];
            //Step 4 :If new gap is greater than previous gap(maxGap) then assign maxGap as gap
            if(gap>maxGap){
                maxGap = gap;
            }
        }
        //Step 4: Update the maximum gap of element
        return maxGap;
    }
}