class Solution {
    public int findMin(int[] nums) {
        /* This solutions works but i need to do on optimal solutions this is nlogn i need to do in log n
        Arrays.sort(nums);
        return nums[0];
        */
        int start = 0;
        int end = nums.length -1;
        while(start<end){
            int mid = start + (end - start)/2;
            if(nums[mid]>nums[end]){
                start = mid + 1; 
            }else{
                end = mid;
            }
        }
        return nums[start];
    }
}