class Solution {
    public boolean isHappy(int n) {
        int i = n;  // slow pointer
        int j = n;  // fast pointer
        
        do {
            i = sumOfSquares(i);        // move 1 step
            j = sumOfSquares(j);        // move 1 step
            j = sumOfSquares(j);        // move another step (total 2)
        } while(i != j);                 // until they meet
        
        return i == 1;                   // happy if they meet at 1
    }
    
    private int sumOfSquares(int n) {
        int sum = 0;
        while(n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }
        return sum; 
    }
}