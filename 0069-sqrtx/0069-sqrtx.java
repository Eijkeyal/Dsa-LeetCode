class Solution {
    public int mySqrt(int x) {
        int start = 1;
        int end = x;
        while( start <=end){
            int mid = start + (end - start)/2;
            if(mid*mid== x){
                return mid;
            } else if(mid>x/mid){
                /* Instead of checking (mid * mid > x), which can overflow for large values we use (mid > x / mid). This safely determines whether mid^2 is greater than x without causing integer overflow.*/

                end= mid -1;
            } else{
                start = mid +1;
            }
        } 
        return end;
    }
}