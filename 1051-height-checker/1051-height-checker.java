class Solution {
    public int heightChecker(int[] heights) {
        //to solve this problem what i did is first copy the array in expected array[]
        int expected[] = new int[heights.length];
        for(int i = 0; i<heights.length; i++){
            expected[i]=heights[i];
        }
        //then sort the copied or new array 
        Arrays.sort(expected);
        int count = 0;
        //compare the original array with sorted array
        for(int i = 0; i<heights.length;i++){
            if(heights[i]!=expected[i]){//if ther is no match between original array with sorted array then count 
                count++;
            }
        }
        //return the counted number of student where students are standing uneven for photo's
        return count;
    }
}