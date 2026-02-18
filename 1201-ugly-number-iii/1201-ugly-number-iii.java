class Solution {
    public int nthUglyNumber(int n, int a, int b, int c) {
   // Binary search boundaries
        long left = 1;
        long right = 2_000_000_000; // Given in constraints
        
        while (left < right) {
            long mid = left + (right - left) / 2;
            
            // Count how many ugly numbers <= mid
            long count = countUgly(mid, a, b, c);
            
            if (count < n) {
                left = mid + 1; // Need bigger number
            } else {
                right = mid;    // This could be answer
            }
        }
        
        return (int) left;
    }
    
    private long countUgly(long num, int a, int b, int c) {
        // Inclusion-Exclusion Principle
        return (num / a) + (num / b) + (num / c)
             - (num / lcm(a, b)) - (num / lcm(b, c)) - (num / lcm(a, c))
             + (num / lcm(a, lcm(b, c)));
    }
    
    // GCD using Euclidean algorithm
    private long gcd(long x, long y) {
        if (y == 0) return x;
        return gcd(y, x % y);
    }
    
    // LCM using GCD
    private long lcm(long x, long y) {
        return x * y / gcd(x, y);
    }
}
