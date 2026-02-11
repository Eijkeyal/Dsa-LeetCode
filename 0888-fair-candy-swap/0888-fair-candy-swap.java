/*class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        for(int i =0;i<aliceSizes.length;i++){
            sumA += aliceSizes[i]; 
        }
          int sumB = 0;
        for(int i =0;i<bobSizes.length;i++){
            sumB += bobSizes[i]; 
        }
        int diff = sumA-sumB;
        Arrays.sort(bobSizes);
        for(int a : aiceSizes){
            int target = a-diff/2; //b= a-diff/2;
            int left = 0;
            int right = bobSizes.length-1;
            while(left<=right){
                int mid = left + (right - left)/2;
                if(bobSizes[mid]==target){
                    return new int[]{a,target};
                    else if (bobSize[mid]<target){
                        left = mid+1;
                    }else{
                        right = mid-1;
                    }
                }
            }
        }
        return new int[0];//should never reach here (gauranteed solution)
    }
}
*
import java.util.Arrays;

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        // Step 1: Calculate total sums
        int sumA = 0;
        for (int i = 0; i < aliceSizes.length; i++) {
            sumA += aliceSizes[i];
        }
        
        int sumB = 0;
        for (int i = 0; i < bobSizes.length; i++) {
            sumB += bobSizes[i];
        }
        
        // Step 2: Calculate difference
        int diff = sumA - sumB;
        
        // Step 3: Sort Bob's array for binary search
        Arrays.sort(bobSizes);
        
        // Step 4: Search for solution
        for (int a : aliceSizes) {
            int target = a - diff / 2;  // b = a - diff/2
            
            // Binary search in bobSizes
            int left = 0;
            int right = bobSizes.length - 1;
            
            while (left <= right) {
                int mid = left + (right - left) / 2;
                
                if (bobSizes[mid] == target) {
                    return new int[]{a, target};
                } else if (bobSizes[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        
        return new int[0]; // Should never reach here (guaranteed solution)
    }
}
*/
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        //Step 1: Sort the Both Arrays for binary search
        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);
        //step 2: Calcaulate total ALice has
        int sumA = 0;
        for(int i = 0;i<aliceSizes.length;i++){
            sumA = sumA + aliceSizes[i];
        }
        //Step 3: Calculate total Candies for Bob has
        int sumB = 0;
        for(int i = 0;i<bobSizes.length;i++){
            sumB = sumB+bobSizes[i];
        }
        // Step 4: Calculate the difference needed to make totals equal
        // Formula: diff = (sumA - sumB)/2
        // This comes from equation: sumA - x + y = sumB - y + x
        int diff = (sumA - sumB)/2;
        for(int x : aliceSizes){
            int y = x - diff;
        
        //start using Binary Search Algorithm check if bob has a box with y candies
        int start = 0;
        int end = bobSizes.length-1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(bobSizes[mid] == y){
                 // Found! Bob has the exact box we need
                // Return the pair [what Alice gives, what Bob gives]
                return new int[]{x,y};
            }else if(bobSizes[mid]<y){
                // Current box is too small, search right half
                start = mid + 1;
            }else{
                // Current box is too large, search left half
                   end = mid - 1;
                }
            }
             // If binary search ends without finding y, try next x
        }
        // Step 7: If no pair found (should never reach here because problem guarantees at least one answer exists)

    return new int[]{-1,-1};
    }
}
