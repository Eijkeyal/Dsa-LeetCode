class Solution {
    public int mySqrt(int x) {
        /*int start = 1;
        int end = x;
        while( start <=end){
            int mid = start + (end - start)/2;
            if(mid*mid== x){
                return mid;
            } else if(mid>x/mid){
                //Instead of checking (mid * mid > x), which can overflow for large values we use (mid > x / mid). This safely determines whether mid^2 is greater than x without causing integer overflow.

                end= mid -1;
            } else{
                start = mid +1;
            }
        } 
        return end;
        */
        // revision of the Questions of 69 Swrt(x)
        int st = 1;//usually starts at 1 for x>=1
        int end = x;// ends the boundary
        while(st<=end){
            int mid = st +(end - st)/2;//find the middle point
            if(mid*mid==x){//if there is perffecct square found
                return mid;
            }else if(mid>x/mid){//Too small (mid<x/mid) this is to prevent stack oveflow for long integer
                end = mid -1;//search at the right hand side
            } else{
                st = mid +1; // too large search at the left hand side
            }
        }
        return end;
    }
}