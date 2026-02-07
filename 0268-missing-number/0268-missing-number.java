class Solution {
    public int missingNumber(int[] nums) {
        /*For ascending order
        Arrays.sort(nums);
    // applying Binary Search algorithim
        int start = 0;
        int end = nums.length;
         while(start < end){
            int mid = start + (end - start)/2;
            if(nums[mid]==mid){
                //missing number is on the right side
                start = mid+1;
            } else {
                end = mid;
            }
         }
         return start;
         */
         Arrays.sort(nums);//sort the array because Binary search wont work on unsorted array
         int start = 0;
         int end = nums.length-1;
         while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid]==mid){
                start = mid +1;//checks the mid in nums[mid]. if it is true then increse by one and checks for another nums[mid] to mid
            } else{
                end = mid -1;
            }
         }
         return start;// return the value of start because it sotres the current the index value which is compared to the mid which is supposed to be missing numbers
    }
}