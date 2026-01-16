class Solution{
    public int [] getConcatenation(int nums[]){
        //take a variable to store original array
        int n = nums.length;
        //create a doulbe size of array which is n*n= 2n because we need to store double size of array than original one
        int ans[] = new int [2*n];
        //iterated to the array 
        for(int i = 0;i<n;i++){
            //whatever loop get element it store to the ans[] array
            ans[i]=nums[i];
            // add the iterated array with previous array which was stored in variable n
            ans[i+n] = nums[i];
        }
        return ans;
    }
}