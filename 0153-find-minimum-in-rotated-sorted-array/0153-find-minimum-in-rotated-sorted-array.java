class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int min = 0;
        while(start<end){
            int mid = start + (end - start)/2;
           if(nums[mid]>nums[end]){//if mid element is greater than last element nums mid =5 and nums end =2 then 2 is smaller element
            start = mid +1;// then search to the right half
           } else{
            end = mid;// otherwise search to the left half
           }
        }
        return nums[start];
    }
}
