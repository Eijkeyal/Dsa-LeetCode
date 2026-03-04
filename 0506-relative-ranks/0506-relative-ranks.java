class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];
         int sorted[] = score.clone();
         Arrays.sort(sorted);//ascending [3,4,8,9,10]
         for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(sorted[j]==score[i]){
                    int rank = n - j;
                    if(rank == 1)
                    result[i] = "Gold Medal";
                    else if(rank ==2)
                    result[i] = "Silver Medal";
                    else if(rank == 3)
                    result[i] = "Bronze Medal";
                    else result[i] = String.valueOf(rank);
                    break;
                }
            }
         }
         return result;
    }
}