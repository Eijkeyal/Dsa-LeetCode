class Solution {
    public int buyChoco(int[] prices, int money) {
        // Step 1: Sort the price to find the pair price
        Arrays.sort(prices);
        int cheapPair = 0;
        // Step 2: Get the two cheapest cholocates
        cheapPair = prices[0] + prices[1];
        // Step 3: check if we can afford them
        if(cheapPair<=money){
            return money - cheapPair;// return the leftover
        }else {
            return money;//return the all money where we can't afford, keep all money
        }
    }
}