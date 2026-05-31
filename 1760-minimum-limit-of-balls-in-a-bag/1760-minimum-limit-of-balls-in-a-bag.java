class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1;
        int right  = 0;
        //find maximum ball in the bag upper bound
        for (int num:nums){
            right = Math.max(right,num);
        }
        while(left<right){
            int mid = left + (right - left)/2;
            if(canAchieve(nums,maxOperations,mid)){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
    private boolean canAchieve(int[] nums, int maxOperations, int penalty){
        int operations = 0;
        for(int balls:nums){
            if(balls>penalty){
                operations = operations + (balls -1)/penalty;
            }
            if(operations>maxOperations){
                return false;
            }
        }
        return true;
    }
}