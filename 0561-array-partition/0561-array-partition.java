class Solution {
    public int arrayPairSum(int[] nums) {
        //This is Greedy Algorithim Questions
        //sor the array
        Arrays.sort(nums);
        //initalize the sum 
        int sum = 0;
        for(int i = 0;i<nums.length;i+=2){//this i+=2 add the adjacent pair sum
            sum = nums[i] + sum;//add total sum at the end 
        }
        return sum;
    }
}