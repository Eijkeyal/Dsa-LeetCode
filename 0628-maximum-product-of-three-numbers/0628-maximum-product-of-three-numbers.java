class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        
        // Case 1: Multiply the LAST THREE elements
        int product1 = nums[n-1] * nums[n-2] * nums[n-3];
        // Case 2: First two (most negative) × last one (largest)
        int product2= nums[0]*nums[1]*nums[n-1];
        //Return the bigger one
        return Math.max(product1,product2);
    }
}
    