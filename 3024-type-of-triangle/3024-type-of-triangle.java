class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        // Step 1: Triangle inequality check
      if(nums[0] + nums[1]<=nums[2]){
        return "none";
      }
      //step 2: Determine check
      if(nums[0]==nums[2]){
        return "equilateral";//All equal
      }
      //Step 3: Two sides equal
      if(nums[0]==nums[1] || nums[1]==nums[2]){
        return "isosceles";
      }
      //Step 4: All Different
      return "scalene";
    }
}