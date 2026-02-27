class Solution{
    public int maximumCount(int nums[]){
        Arrays.sort(nums);
        //Step 1: Make two empty variables fto store the maxPositive and maxNwgative integrs
        int maxPositive = 0;
        int maxNegative = 0;
        //Step 2: Iterate entire array
        for(int i = 0; i<nums.length; i++){
            //Step 3: Compare with 0 if greater than 0 then increae by one but ignore the 0if less than zero increase by one but ignore the 0 
            if(nums[i]>0){
                maxPositive++;
            }else if(nums[i]<0){
                maxNegative++;
            }
        }
        //Step 3: Compare of between positive and negative counted variables and if positive is greater than negative then return positive otherwise return negative integer 
        if(maxPositive>maxNegative){
            return maxPositive;
        }else {
            return maxNegative;
        }
    }
}
/*
class Solution{
    public int maximumCount(int nums[]){
        Arrays.sort(nums);
        int positive = 0;
        int negative = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>0){
                positive++;
            }
            if(nums[i]<0){
                negative++;
            }
        }
        if(positive>negative){
            return positive;
        }else{
           return negative;
        }
    }
}*/