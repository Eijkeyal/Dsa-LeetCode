class Solution{
    public int findKthPositive(int[] arr, int k){
        int left = 0;
        int right = arr.length-1;
        // Binary search to find the first index where missing_count >= k
        while(left<=right){
            int mid = left + (right - left)/2;
            int missing = arr[mid]-(mid +1);
            if(missing<k){
                left = mid + 1;
            } else{
                right = mid -1;
            }
        }

        // When loop ends, left is the first index where missingCount >= k
        // or left = arr.length if all missingCount < k
        return k+left;
    }
}