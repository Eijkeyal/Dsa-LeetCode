class Solution{
    public int findMaxConsecutiveOnes(int [] nums){
        int count = 0;
        int max = 0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]==1){
                //increment count by 1 
                count++;
                if(count>max){//compare to the max
                    max = count;
                }
            }else{
                count = 0;// if there is no more consecutive ones then set count as 0
            }
        }
        return max;
    }
}