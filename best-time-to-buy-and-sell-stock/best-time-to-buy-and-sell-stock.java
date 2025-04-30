class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i=0, j=0; i<prices.length; i++) {
            if(prices[i] <= prices[j]){
                j=i;
            } else {
                profit = Math.max(profit, prices[i]-prices[j]);
            } 
        }
        return profit;
    }
}