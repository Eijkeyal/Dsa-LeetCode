class Solution {
    public boolean isPalindrome(String s) {
        // Convert entire string to lowercase first
        s = s.toLowerCase();
        
        int i = 0;
        int j = s.length() - 1;
        
        while (i < j) {
            char left = s.charAt(i);
            char right = s.charAt(j);
            
            // Skip non-alphanumeric characters
            if (!Character.isLetterOrDigit(left)) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(right)) {
                j--;
                continue;
            }
            
            if (left != right) {
                return false;
            }
            
            i++;
            j--;
        }
        return true;
    }
}