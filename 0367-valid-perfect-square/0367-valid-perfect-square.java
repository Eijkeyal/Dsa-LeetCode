class Solution {
    public boolean isPerfectSquare(int num) {
       // int num=0;
       if (num<1) return false;
       if(num ==0) return true;

       long start =1;
       long end = num;

       while(start<=end){
        long mid = start + (end - start)/2;
        long squ = mid*mid;

        if(squ==num){
            return true;
            
       } else if(squ<num){
            start = mid +1;
        
       } else{
            end = mid -1;
       }
    }
    return false;
        
    }
}