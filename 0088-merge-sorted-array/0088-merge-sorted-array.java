/*
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //start from the end
        int i = m -1;//last element in nums1
        int j = n-1;// last element in nums2
        int k = m+n-1; //last position in nums1
        // Start merge while both arrays have elements
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];  
                j--;
            }
            k--;
        }
        // if nums2 still has elements, copy them
        while(j>=0){
            nums1[k] = nums2[j];
            j--;
            k--;// no need to copy remaining nums1 elements they are already in place
        }
    }
}
*/
class Solution{
    public void merge(int[] nums1, int m, int[] nums2, int n){
        int result[] = new int[m+n];
        int i = 0; 
        int j = 0;
        int k = 0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                result[k++] = nums1[i++];
            }else{
                result[k++] = nums2[j++];
            }
        }
        while(i<m){
            result[k++] = nums1[i++];
        }
        while(j<n){
            result[k++] = nums2[j++]; 
        }
        for(int x = 0; x<m+n;x++){
            nums1[x] = result[x];
        }
    }
}