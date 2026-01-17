class Solution{
    public int[] shuffle(int [] nums, int n){
        //create the double size of array n
        int result[] = new int[2*n];
        // run loop to n times
        for(int i = 0;i<n;i++){
            //for first half element
            result[2*i] = nums[i];
            // for second half element
            result[2*i + 1] = nums[n+i];
        }
        return result;
    }
}