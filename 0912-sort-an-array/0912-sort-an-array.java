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
}*/
class Solution {
    public int[] sortArray(int[] nums) {
        for (int i =1;i<nums.length;i++){
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
    }
}