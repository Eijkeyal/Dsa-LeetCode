class Solution {
    public int countBinarySubstrings(String s) {
        //convert the string into array 
        char arr[] = s.toCharArray();
        int count = 0;
        int prevGroup = 0;
        int currGroup = 1;
        // Traverse array to identify groups of consecutive identical characters

        for(int i = 1; i<arr.length; i++){
            if(arr[i] == arr[i-1]){
                currGroup++;//Expand Current Group
            }else {
                count += Math.min(prevGroup,currGroup);
                prevGroup = currGroup;//Move to Next Group
                currGroup = 1;//start new Group
            }
        }
        // Add valid substrings from the last adjacent pair
        count +=Math.min(prevGroup,currGroup);
        return count;
    }
}