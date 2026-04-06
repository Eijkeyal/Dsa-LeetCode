class Solution {
    public int triangleNumber(int[] nums) {
       Arrays.sort(nums);
       int count = 0;
       int n = nums.length;
       //Check all triplets using 3 nested loop
       for(int i=0;i<n;i++){
         for(int j = i +1;j<n-1;j++){
            for(int k = j+1;k<n;k++){
                //After sorting we need to check a+b>c
                if(nums[i] + nums[j]>nums[k]){
                    count++;
                }else{
                    break;
                }
            }
         }
       }
       return count;
    }
}