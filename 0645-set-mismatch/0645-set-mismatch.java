class Solution{
    public int[] findErrorNums(int nums[]){
        int n = nums.length;
        int duplicate = 0;
        int actualSum = 0;
        for(int i = 0;i<n;i++){// runs loop to the each element 
            actualSum = nums[i]+actualSum;// add current sum of element
            for(int j = i+1;j<n;j++){// runs loop to compare to each element
                if(nums[j]==nums[i]){// checks dupliate element
                    duplicate = nums[i];
                    break;
                }
            }
        }
        int expectedSum = n*(n+1)/2;// calculate the total sum using sequence and series formula
        int missing = expectedSum - actualSum + duplicate;
        return new int [] {duplicate, missing};// if there is any duplicate and missing number it returns the element
    }
}

