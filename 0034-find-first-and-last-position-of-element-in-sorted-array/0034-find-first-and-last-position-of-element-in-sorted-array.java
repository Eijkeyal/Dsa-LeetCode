class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int result = -1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                result = mid;
                // Find first occurrence
                int first = mid;
                while (first > 0 && nums[first - 1] == target) {
                    first--;
                }
                // Find last occurrence
                int last = mid;
                while (last < nums.length - 1 && nums[last + 1] == target) {
                    last++;
                }
                // Return array
                return new int[]{first, last};
            }
        }
        
        // Target not found
        return new int[]{-1, -1};
    }
}