class Solution {
    public int getCommon(int nums1[], int nums2[]){
        int i = 0;
        int j = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                return nums1[i];//return common value
            }else if(nums1[i]<nums2[j]){
                i++;// Move pointer in Num1
            }else{
                j++;// MOve pointer in another Num2
            }
        }
        return -1;// If there is no common elements found then return -1
    }
}