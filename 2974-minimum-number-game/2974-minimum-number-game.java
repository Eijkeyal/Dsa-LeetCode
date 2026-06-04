class Solution {
    public int[] numberGame(int[] nums) {
        //sort the array
        Arrays.sort(nums);
        int[] arr = new int[nums.length];
        
        for(int i = 0; i < nums.length; i += 2) {
            arr[i] = nums[i + 1];     // Bob's number (second smaller)
            arr[i + 1] = nums[i];     // Alice's number (first smaller)
        }
        
        return arr;
    }
}