class Solution {
    public boolean isPerfectSquare(int num) {/*
      if(num<0) return false;
      if(num==0 || num ==1) return true;
      int start = 1;
      int end = num/2; //because For any number n > 2, the square root is ≤ n/2:For any number n > 2, the square root is ≤ n/2
      while(start<=end){
        int mid = start + (end - start)/2;
        long square = (long) mid*mid;
        if(square==num){
            return true;
        } else if(square<num){
            start = mid+1;
        }else{
            end = mid -1;
        }
      }
      return false;*/
      //This is the questions no 367 valid Perfect Square by using Binary Search Algorithm
      if(num<0) return false;// this is because we only need positive integer(non negattive integer) not a negative integer
      if(num==0 || num==1) return true;//this checks is this nums perfect square or not 
      int start = 1;
      int end = num/2;
      while(start<=end){
        int mid = start + (end - start)/2;
        long square = (long)mid*mid;// this is usually done to prevent overflow in long size of integer
        if(square == num){
            return true;
        }else if(square<num){
            start = mid+1;
        }else {
            end = mid -1;
        }
      }
      return false; // if any of condition failed it return false 
    }
}