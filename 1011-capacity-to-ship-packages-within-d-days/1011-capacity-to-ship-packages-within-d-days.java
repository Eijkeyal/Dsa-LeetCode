class Solution {
    private boolean canShip(int [] weights, int days, int capacity){
        int daysUsed = 1;
        int currentWeights = 0;
        for( int w : weights){
            if(currentWeights + w > capacity){
                daysUsed++;
                currentWeights = w;
            }else{
                currentWeights += w;
            }
        }
        return daysUsed<= days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        for(int w : weights){
            left = Math.max(left,w);
            right += w;
        }
        while(left<right){
            int mid = left + (right - left)/2;
            if(canShip(weights,days,mid)){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}