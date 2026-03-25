
class Solution {
    public int maxArea(int[] height) {
        int left = 0;                     // Left pointer (start)
        int right = height.length - 1;    // Right pointer (end)
        int maxWater = 0;                 // Store maximum area found
        
        while(left < right) {
            // Calculate width between two lines
            int width = right - left;
            
            // Height is the shorter line (water spills over shorter one)
            int containerHeight = Math.min(height[left], height[right]);
            
            // Calculate current area
            int currentArea = width * containerHeight;
            
            // Update max water if current is larger
            maxWater = Math.max(maxWater, currentArea);
            
            // Move the pointer pointing to the shorter line
            if(height[left] < height[right]) {
                left++;   // Move left pointer forward
            } else {
                right--;  // Move right pointer backward
            }
        }
        
        return maxWater;
    }
}