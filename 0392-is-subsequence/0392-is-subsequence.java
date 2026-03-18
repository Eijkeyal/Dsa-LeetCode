class Solution {
    public boolean isSubsequence(String s, String t) {
        //convert string into array
        char tChars[] = t.toCharArray();
        char sChars[] = s.toCharArray();
        //initialze two pointer
        int i = 0;// pointer for t
        int j = 0;//pointer fot s
        while(i<tChars.length && j<sChars.length){
            if(tChars[i]==sChars[j]){
            // Found matching character, move both pointers
                j++;
            }
            i++;
            // Always move t pointer
        } 
    // If we've matched all characters in s, it's a subsequence
    return j == sChars.length;
    }
}