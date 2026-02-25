class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();
        
        // Find FIRST occurrence
        int start = 0;
        int end = nums.length - 1;
        int first = -1;
        
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                first = mid;
                end = mid - 1;  // Search left
            } else if(nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        // If target not found, return empty list
        if(first == -1) {
            return result;  // Returns [] not [-1]
        }
        
        // Find LAST occurrence
        start = 0;
        end = nums.length - 1;
        int last = -1;
        
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                last = mid;
                start = mid + 1;  // Search right
            } else if(nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        // Add all indices from first to last
        for(int i = first; i <= last; i++) {
            result.add(i);
        }
        
        return result;
    }
}