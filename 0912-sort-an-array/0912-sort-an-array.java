//this is normal sorting using nested loop
/*class Solution {
    public int[] sortArray(int[] nums) {
    for(int i = 0;i<nums.length;i++){
        for(int j=0;<nums.length;j++){
            if(nums[i]>nums[j]){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        return nums;
    }
  }
}*
class Solution {
    public int[] sortArray(int[] nums) {
        /*for (int i =1;i<nums.length;i++){
            //apply insertion sort
            int current = nums[i];
            int previous = i-1;
            while(previous>=0 && nums[previous]>current){
                nums[previous +1] = nums[previous];
                previous--;
            }
            nums[previous+1] = current;
        }
        return nums;
        *
    class Solution{
        public int[] sortArray(int [] nums){
        // Applying merge sort
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            sortArray(arr,start,mid)// for left part
            sortArray(arr,mid+1,end)
        }
        // for merge step
        public void sortArray(arr,start,end,mid){
            ArrayList<int> temp;
            i = start; j= mid+1;
            whilee(i<=mid && j<=end){
                ifnums[i]<= nums[j]){
                    int temp = nums[i];
                    i++;
                } else {
                    int temp = nums[j];
                    j++;
                }
            }
        }
        // to store sorted array in temporary array
        while(i<=mid){
            int temp = nums[i];
            i++;
        } while(j<=end){
            int temp = nums[j];
            j++;
        }
        // to store permanent array from temporary array
        for(int index=0;index<temp.size();index++){
            nums[index + start] = temp[index];
        }
    }
}
*/
import java.util.ArrayList;

class Solution {
    public int[] sortArray(int[] nums) {
       //Applyng merge sort
       int start = 0;
       int end= nums.length-1;
       mergeSort(nums,start,end);
       return nums;
    }
    private void mergeSort(int arr[], int start, int end){
        if(start>=end){
            return;
        }
        int mid = start + (end - start)/2;
        mergeSort(arr,start,mid);// for left part
        mergeSort(arr, mid + 1,end);// for end part
        merge(arr,start,mid,end);// for merge step
    }
    private void merge(int[] arr, int start, int mid,int end){
        ArrayList<Integer> temp = new ArrayList<>();
        int i = start;
        int j = mid+1;
        while(i<=mid && j<= end){
            if(arr[i]<= arr[j]){
                temp.add(arr[i]);
                i++;
            }else {
                temp.add(arr[j]);
                j++;
            }
        }
        //to store remaining elements from left half
        while(i<=mid){
            temp.add(arr[i]);
            i++;
        }
        //to store remaining elements from right half
        while(j<=end){
            temp.add(arr[j]);
            j++;
        }
        // to store permanent array from temporary array
        for(int index =0;index<temp.size();index++){
            arr[index + start] = temp.get(index);
        }
    }
}
