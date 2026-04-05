class Solution {
    public String reverseOnlyLetters(String s) {
        //Convert string to array
        char arr[] = s.toCharArray();
        //Using two pointer approach
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            //Skip non-letters from left
            while(left<right &&!Character.isLetter(arr[left])){
                left++;
            }
            //skip non-letters from right
            while(left<right &&!Character.isLetter(arr[right])){
                right--;
            }
            //Swap letters
            char temp =arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
}