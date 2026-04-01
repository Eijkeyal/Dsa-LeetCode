class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zeros = 0;
        //Count zeros that will be duplicated
        for(int i = 0; i<n; i++){
            if(arr[i] == 0){
                zeros++;
            }
        }
        //using fast and slow pointers
        int slow = n-1;
        int fast = n+zeros -1;
        //Traverse from right to left
        while(slow>=0 && fast>=0){
            if(fast < n){
                arr[fast] = arr[slow];
            }
            //if current element is zero, duplicate it
            if(arr[slow] == 0){
                fast--;
                if(fast<n){
                    arr[fast] = 0;
                }
            }
            slow--;
            fast--;
        } 
    }
}