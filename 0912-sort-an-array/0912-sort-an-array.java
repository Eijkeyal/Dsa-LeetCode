/*class Solution {
    public int[] sortArray(int[] nums) {
    for(int i =5;i>=1;i--){
        int curr = nums[i];
        int previous = i-1;
        while(previous>=0 && nums[previous]>curr){
            nums[previous+1]=nums[previous];
            previous--;
        }
        nums[previous +1] = curr;
    }
    return nums;
  }
}*/
class Solution {
    public int[] sortArray(int[] nums) {
        for (int i =1;i<nums.length;i++){
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