class Solution {
    public String reverseWords(String s) {
        //Convert String into array
        char arr[] = s.toCharArray();
        int start = 0;
        for(int i = 0; i<=arr.length; i++){
            //If we hit a space or end of the String
            if(i == arr.length || arr[i] == ' '){
            int left = start;
            //Reverse from 'Start' to 'i-1'
            int right = i -1;
            while(left<right){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
                }
                //Next word starts after space
                start = i+1;
            }
        }
        return new String(arr);
    }
}