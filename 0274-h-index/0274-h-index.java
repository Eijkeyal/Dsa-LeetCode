class Solution {
    public int hIndex(int[] citations) {
        for(int i=0;i<citations.length;i++){
            for(int j=0;j<citations.length;j++){
                if(citations[i]<citations[j]){
                int temp = citations[i];
                citations[i]=citations[j];
                citations[j]=temp;
                }
            }
        }
        int h =0;
        for(int i =0;i<citations.length;i++){
            int papers = citations.length-i;
            if(citations[i]>=papers){
                h = papers;
                break;
            }
        }
        return h;
    }
}