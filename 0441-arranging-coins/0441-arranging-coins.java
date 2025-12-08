/*
class Solution {
    public int arrangeCoins(int n) {
        int left = 1;//minimum row
        int right = n;//maximum n row
        while(left<=right){
            long  mid = left + (right - left)/2;
            long coinNeeded = mid *(mid +1)/2;
            if(coinNeeded == n){
                return (int)mid; //perfect fit
            } else if(coinNeeded <n){
                left = mid -1;//can try more rows
            } else {
                right = mid +1; // too many rows
            }
        }
        return (int)right; //right is the largest valid k
    }
}
*/


class Solution {
    public int arrangeCoins(int n) {
        long left = 1;  // Use long to prevent overflow
        long right = n;
        
        while(left <= right){
            long mid = left + (right - left)/2;
            long coinNeeded = mid * (mid + 1) / 2;
            
            if(coinNeeded == n){
                return (int)mid;  // Perfect fit
            } else if(coinNeeded < n){
                left = mid + 1;  // We can try MORE rows
            } else {
                right = mid - 1; // Need FEWER rows
            }
        }
        
        return (int)right;  // Right is the largest valid k
    }
}