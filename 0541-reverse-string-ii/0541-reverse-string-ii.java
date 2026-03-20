class Solution {
    public String reverseStr(String s, int k) {
        /*
        char[] arr = s.toCharArray();
        int n = arr.length;
        
        for(int i = 0; i < n; i += 2*k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1); 
            while(left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        
        return new String(arr);
        */
        char[] arr = s.toCharArray();
        // Two pointers for entire string
        int i = 0;  // Points to start of each chunk
        int j = 0;  // Points to end of reverse section
        
        while(i < arr.length) {
            // Set j to the end of the segment to reverse
            j = i + k - 1;
            
            // If j goes beyond array, set to last index
            if(j >= arr.length) {
                j = arr.length - 1;
            }
            
            // Reverse from i to j
            int left = i;
            int right = j;
            
            while(left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            
            // Move to next chunk (2k steps forward)
            i = i + 2*k;
        }
        
        return new String(arr);
    }
}