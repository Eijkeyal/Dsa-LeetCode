class Solution {
    public int[] sortedSquares(int[] nums) {
       int Squared[] = new int[nums.length];//create a array named Squared
        for(int i = 0; i<nums.length; i++){//iterate till the end of num length
           Squared[i] = nums[i] * nums[i];//Multiply i to i (for making squared)
        }
        Arrays.sort(Squared);//sort the squared array
        return Squared;//return the sorted array
    }
}
 