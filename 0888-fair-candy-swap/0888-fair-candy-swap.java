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
*/

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