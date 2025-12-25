class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length-1;
        char result = letters[0];
        while(left<=right){
            int mid = left + (right - left)/2;
            if(letters[mid]>target){
                result = letters[mid];
                right = mid -1;//move left
            } else{
                left = mid +1;//move right
            }
          }
      
        return result;
    }
}
/*
class Solution{
    public char nextGreatestLetter(char[] letters, char target){
        int left = 0;
        int right = letters.length-1;
        char result = letters[0];
        while(left<=right){
            int mid = left + ( right - left)/2;
                if(letters[mid]==target){
                    result = letters[mid];
                } else if(letters[mid]>target){
                    right = mid-1;
                }else{
                    left = mid +1;
                }
            }
        
        return result;
    }
}
*/