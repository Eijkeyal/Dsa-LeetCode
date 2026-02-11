class Solution {
    public long repairCars(int[] ranks, int cars) {
      
        // Binary search on time
        long left = 1;
        
        // Find minimum rank for upper bound
        int minRank = ranks[0];
        for (int r : ranks) {
            minRank = Math.min(minRank, r);
        }
        // Worst case: slowest mechanic (min rank) repairs all cars
        long right = (long) minRank * cars * cars;
        
        while (left < right) {
            long mid = left + (right - left) / 2;
            
            if (canRepair(ranks, cars, mid)) {
                right = mid;  // Try smaller time
            } else {
                left = mid + 1;  // Need more time
            }
        }
        
        return left;
    }
    
    private boolean canRepair(int[] ranks, int cars, long time) {
        long totalCars = 0;
        
        for (int r : ranks) {
            // Each mechanic can repair floor(sqrt(time / r)) cars
            totalCars += Math.sqrt(time / r);
            if (totalCars >= cars) {
                return true;  // Early exit
            }
        }
        
        return totalCars >= cars; 
    }
}

