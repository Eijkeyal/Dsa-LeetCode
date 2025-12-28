class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        // If total flowers needed (m * k) is more than available flowers,
        //for impossible case
        if((long)m*k>bloomDay.length)
        return -1;
        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
        for(int day:bloomDay){
            start=Math.min(start, day);
            end=Math.max(end,day);
        }
         // To store the minimum valid day
        int answer =-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(makeBouquets(bloomDay,m,k,mid)){
                answer = mid;
                end  = mid -1;
            }else{
                start = mid +1;
            }
        }
        return answer;
    }
    private boolean makeBouquets(int [] bloomDay, int m, int k, int day){
        int bouquets = 0;
        int flowers = 0;
        for(int i=0;i<bloomDay.length;i++){
             // If the flower has bloomed by 'day'
            if(bloomDay[i]<=day){
                flowers++;
                if(flowers==k){
                    bouquets++;
                    flowers = 0;//reset after forming a bouquet
                }
            }else {
                flowers = 0;//break adjacency
            }
        }
         // Return true if we can form at least m bouquets
        return bouquets>=m;
    }
}