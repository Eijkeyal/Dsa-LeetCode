class Solution {
    public boolean search(int[] nums, int target) {
        //this problem is solved by usnig two algorithim which is Two Pointers and Binary Search 
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end -start )/2;
            if (nums[mid]==target){
                return true;
            }
            // check duplicates
            if(nums[start]==nums[mid] && nums[mid] == nums[end] ){
                start ++;
                end--;
            } //check left half
            else if(nums[start]<=nums[mid]){
                if(nums[start]<= target && target<nums[mid] ){
                end = mid-1;
            } else{
                start =mid+1;
                }
            }
             else{
                if(nums[mid]<target && target<=nums[end]){
                    start = mid +1;
                } else{
                    end= mid-1;
                }
            }
        }
        return false;
    }

//Here i want to solve same problem by new approach 
class Solution{
    public boolean search(int[] nums, int target){
        //using ony binary search algorithim
        Arrays.sort(nums);//sort the array in ascending order
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid]==target){// if nums[mid] is equals to the Target then return the True other wise search either left or right
                return true;
            }else if(nums[mid]>target){
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }
        return false;// if there is none of conditions meets the targeted element the return fale it shows there is no element that meet the conditiosn
        
    }
}
