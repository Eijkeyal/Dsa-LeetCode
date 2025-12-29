class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i = 0;i<heights.length;i++){
            for(int j = 0;j<heights.length;j++){
                if(heights[i]>heights[j]){//Ascending Order
                    //heights swap
                    int tempH = heights[i];
                    heights[i] = heights[j];
                    heights[j] = tempH;
                   // names swap
                   String tempN = names[i];
                   names[i]=names[j];
                   names[j] = tempN; 
                }
            }
        }
        return names;
    }
}
