class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        Arrays.sort(houses);
        int radius = 0;
        int j = 0;
        for(int i = 0;i<houses.length;i++){
            while(j<heaters.length - 1 && Math.abs(heaters[j+1] - houses[i])<= Math.abs(heaters[j]-houses[i])){
                j++;
            }
            radius = Math.max(radius,Math.abs(heaters[j]-houses[i]));
        } 
        return radius;
    }
}