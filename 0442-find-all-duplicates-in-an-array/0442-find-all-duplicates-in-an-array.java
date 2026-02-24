class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        //Step 1 : Sort the Array
        Arrays.sort(nums);
        //Step 2: Put into ArrayList
        List<Integer> result = new ArrayList<>();
        //Step 3: Iterate through the entire Array
        for(int i = 1;i<nums.length; i++){
            //Step 5: If current element equals previous element, it's a duplicate
            if(nums[i]==nums[i-1]){
                result.add(nums[i]);// Add every duplicate element 
            }
        }
        return result;// return the duplicate elememt from the array
    }
}