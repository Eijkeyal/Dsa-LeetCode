class Solution {
    public String reverseByType(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        
        // First, reverse only letters
        int left = 0;
        int right = n - 1;
        
        while(left < right) {
            // Move left until we find a letter
            while(left < right && !isLetter(arr[left])) {
                left++;
            }
            // Move right until we find a letter
            while(left < right && !isLetter(arr[right])) {
                right--;
            }
            // Swap letters
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        
        // reverse only special characters
        left = 0;
        right = n - 1;
        
        while(left < right) {
            // Move left until we find a special char
            while(left < right && !isSpecial(arr[left])) {
                left++;
            }
            // Move right until we find a special char
            while(left < right && !isSpecial(arr[right])) {
                right--;
            }
            // Swap specials
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        
        return new String(arr);
    }
    
    private boolean isLetter(char c) {
        return c >= 'a' && c <= 'z';
    }
    
    private boolean isSpecial(char c) {
        return "!@#$%^&*()".indexOf(c) != -1;
    }
}