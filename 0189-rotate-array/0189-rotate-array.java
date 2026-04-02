class Solution {
    public void rotate(int[] nums, int k) {
       int n = nums.length;
       k = k%n; //in case k is greater than n 
       int result[] = new int[n];//create a new array to store
       //iterate till the k 
       for(int i = 0;i<k;i++){
        result[i] =nums[n -k+i]; 
       }
       //copy first n-k elements to the end of result
       for(int i =0;i<n -k;i++){
        result[k+i] = nums[i];
       }
       //copy back to original array
       for(int i = 0;i<n;i++){
        nums[i] = result[i];
       }
    }
}