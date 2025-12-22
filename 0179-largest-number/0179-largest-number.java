class Solution {
    public String largestNumber(int[] nums) {
        // Convert to strings
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        
        // Your nested loop with custom comparison
        for (int i = 0; i < strs.length; i++) {
            for (int j = i + 1; j < strs. length; j++) {
                // Compare concatenations
                if ((strs[i] + strs[j]).compareTo(strs[j] + strs[i]) < 0) {
                    String temp = strs[i];
                    strs[i] = strs[j];
                    strs[j] = temp;
                }
            }
        }
        
        // Handle all zeros
        if (strs[0]. equals("0")) return "0";
        
        // Build result
        StringBuilder sb = new StringBuilder();
        for (String s : strs) sb.append(s);
        return sb.toString();
    }
}