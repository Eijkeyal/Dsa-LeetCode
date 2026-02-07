class Solution {
    public int searchInsert(int[] nums, int target) {
         /*int st = 0;
        int end = nums.length-1;
        int mid = 0;
       // int return =-1;
        while(st<=end){
            mid = st +(end-st)/2;

         if( target==nums[mid]){
            return mid;
        } else if(nums[mid]<target){
            st = mid+1;
        } else {
            end = mid-1;
        }
       
        }
         return st;
         */
         //this is the revision of Binary Search problems
         int st = 0;//start with 0
         int end = nums.length-1;
         while(st<=end){
            int mid = st + (end - st)/2;//it caclculates the mid like (0+3/2=1)
            if(nums[mid]==target){//if here we found mid then return imedately 
                return mid;
            }else if(nums[mid]<target){//if not found amd also target is greater than mid then we must search to the right hand side of the mid
                st = mid +1;
            }else{//if target is less than the target then we need to search to the left by placing mid -1 which sets then new end point for the left hand side
                end = mid -1;
            }
         }
         return st;// atlast we must return the st becuse it store the index of the targeted the element it start form Zero
    }
}