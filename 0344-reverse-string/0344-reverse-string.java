class Solution {
    public void reverseString(char[] s) {
        char reversed[] = new char[s.length];
        for(int i=0;i<s.length;i++){
            reversed[i] = s[s.length-1-i];// it rreversed the array
        }
        for(int i=0;i<s.length;i++){// this iterations replaces the reversed with original one
            s[i] = reversed[i];
        }
    }
}