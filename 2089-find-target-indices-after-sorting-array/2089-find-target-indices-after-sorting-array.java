import java.util.*;
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
      //  int target = 2;
        //int result=0;
        for(int i = 0;i<nums.length;i++){
            for(int j = i;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp; 
                }
            }

        }
        List<Integer> result = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
        if(nums[i]==target){
            result.add(i);
        }
     }
        return result;  
    }
}