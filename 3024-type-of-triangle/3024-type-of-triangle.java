class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        //Triangle inequality check
      if(nums[0] + nums[1]<=nums[2]){
        return "none";
      }
      //Determine check
      if(nums[0]==nums[2]){
        return "equilateral";//All equal
      }
      if(nums[0]==nums[1] || nums[1]==nums[2]){
        return "isosceles";//Two sides equal
      }
      return "scalene";//All Different
    }
}