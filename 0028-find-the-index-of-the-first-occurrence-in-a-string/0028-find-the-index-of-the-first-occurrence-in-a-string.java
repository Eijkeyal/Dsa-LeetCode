class Solution {
    public int strStr(String haystack, String needle) {
       int n = haystack.length();
       int m = needle.length();
       if(m==0)
       return 0;
       if(m>n)
       return -1;
       //using two pointer approach
       int i = 0;//pointer haystack moves forward when mismatch
       int j = 0;// pointer for needle resrs to 0 when mismatched
       while(i<n && j<m){
        if(haystack.charAt(i) == needle.charAt(j)){
            i++;//move both pointer forward if character matcched
            j++;
        }else{
            i = i-j+1;//start with next string after getting mismatched
            j=0;//still set as 0 
        }
       }
       if(j==m){//if we reached at the end of needle, we found it
        return i-j;
       }
       return -1;
    }
}