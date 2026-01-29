class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            // Skip non-vowels from left side
            while (left < right && !isVowel(chars[left])) {
                left++;
            }
            
            // Skip non-vowels from right side
            while (left < right && !isVowel(chars[right])) {
                right--;
            }
            
            // Swap vowels
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        
        return new String(chars);
    }
        // This method works for ALL strings
    private boolean isVowel(char c) {
        // Convert to lowercase to handle both cases
        c = Character.toLowerCase(c);
        // Check if it's a vowel
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}