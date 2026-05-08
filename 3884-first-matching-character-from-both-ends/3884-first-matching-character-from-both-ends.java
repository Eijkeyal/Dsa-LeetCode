class Solution {
    public int firstMatchingIndex(String s) {
        //matching character from both ends using two pointer approach
        int left = 0;
        int right = s.length()-1;
        for(int i = 0; i<s.length();i++){//iterate throughout the string
            if(s.charAt(left) == s.charAt(right)){//compare to left and right string
                return left;
            }
                left++;//increase by 1 if not found
                right--;//decrese by 1 if not found
            }
        return -1;//return -1 if there is not matching with anyone
    }
}