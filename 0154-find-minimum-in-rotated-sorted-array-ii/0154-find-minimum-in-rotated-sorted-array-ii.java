class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end= nums.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(nums[mid]>nums[end]){
                start = mid+1;
            }else if(nums[mid]<nums[mid]){
                end= mid;
            } else{
                end--;//Removing one duplicate does not remove the minimum If the minimum were nums[end], then nums[mid] would also be the same
            }

        }
        return nums[start];
    }
}