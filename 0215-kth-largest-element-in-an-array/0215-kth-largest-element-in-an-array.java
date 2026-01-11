class Solution {
    public int findKthLargest(int[] nums, int k) {
        //sort the array first
        int sorted [] = sortArray(nums);
        return sorted[sorted.length-k];
    }
    public int [] sortArray(int [] nums){
        if(nums == null || nums.length<=1){
            return nums;
        } 
        mergeSort(nums, 0,nums.length-1);
        return nums;
    }
    private void mergeSort(int [] nums, int left, int right){
        if (left>=right){
            return;
        }
        // find middle point
        int mid = left + (right - left)/2;
        //recursively sort left and right halves
        mergeSort(nums, left,mid);
        mergeSort(nums, mid+1, right);
        //merge the sorted halves
        merge(nums, left, mid, right);
    }
    private void merge(int [] nums, int left, int mid, int right){
        // create temporary arrays for left and right halves
        int leftArray[] = new int[mid - left +1];
        int rightArray[] = new int [right - mid];
        //copy data to temporary arrays
        for(int i = 0;i<leftArray.length;i++){
            leftArray[i] = nums[left + i];
        }
        for(int i = 0;i<rightArray.length;i++){
            rightArray[i] = nums[mid +1 +i];
        }
        //merge the temporary back into nums
        int i = 0,j=0,k=left;
        while(i<leftArray.length && j<rightArray.length){
            if(leftArray[i]<= rightArray[j]){
                nums[k] = leftArray[i];
                i++;
            } else{
                nums[k] = rightArray[j];
                j++;
            }
            k++;
        }
        //Copy remaining elements of the leftArray
        while(i<leftArray.length){
            nums[k] = leftArray[i];
            i++;
            k++;
        }
        //copy remaining elements of rightway
        while(j<rightArray.length){
            j++;
            k++;
        }
    }
}