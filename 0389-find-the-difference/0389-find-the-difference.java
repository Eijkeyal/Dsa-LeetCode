class Solution {
    public char findTheDifference(String s, String t) {
        // Convert strings to character arrays
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        
        // Sort both arrays
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        
        // Compare character by character
        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i] != tArr[i]) {
                return tArr[i]; // Found the different character
            }
        }
        
        // If all characters in s match the first n characters of t,
        // then the extra character is at the last position of t
        return tArr[tArr.length - 1];
    }
}