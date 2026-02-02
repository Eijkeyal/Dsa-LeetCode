class Solution{
    public int countPairs(List<Integer> nums, int target){
        int count = 0;
        int n = nums.size();// it gets the elements of arrays(nums)
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(nums.get(i)+nums.get(j)<target){//adding i and j to compare with target
                    count++;//if less than th target then increase by one
                }
            }
        }
        return count;
    }
}