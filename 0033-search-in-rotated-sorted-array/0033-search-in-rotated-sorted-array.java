class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            //Step 1: Check the target is equal to the Mid or not
            if(nums[mid] == target){
                return mid;
            }
            //Step 2: Check which half is sorted
            if(nums[start]<= nums[mid]){//Left half is sorted
                if(nums[start]<=target && target<nums[mid]){
                    end = mid - 1;//Target is left half
                }else {
                    start = mid + 1;//Target is right half
                }
            } else {//Righ half is sorted 
                if(nums[mid]<target && target<=nums[end]){
                    start = mid + 1;//Target is left half
                }else {
                    end = mid - 1;//Target is in right half
                }
            }
        }
        return -1;//Target Not found
    }
}