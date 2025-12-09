class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int result = -1;
        while(start<end){
            int mid =start + (end - start)/2;
            if(nums[mid]<=nums[mid+1]){
                start = mid +1;//search if peak is to the right
               // result =mid; 
            } else{
                end = mid;// peak could be the left
            }
        }
        return start;
        
    }
}