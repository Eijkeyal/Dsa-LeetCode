class Solution {
    public boolean checkIfExist(int[] arr) {
        //sort the array because Binary Search Only applicable in Sorted Array
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int target =arr[i]*2;
            //search for target in the array
            int index = binarySearch(arr,target);
            //if found it's not the same element (different index)
            if(index != -1 && index !=i){
                return true;
            }
        }
        return false;
    }
    private int binarySearch(int[] arr,int target){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                left = mid + 1;
            }else{
                right= mid-1;
            }
        }
        return-1;
    }
}