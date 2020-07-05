
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length==0) return 0;
        
        int j=prices.length-1;
        int maxProfit = 0;
        
        for(int i=prices.length-1;i>=0;i--){
            if(prices[i]<=prices[j]){
                if((prices[j] - prices[i])>maxProfit){
                    maxProfit = prices[j] - prices[i];
                }
            }
            else j-=(j-i);
        }
        
        return maxProfit;
    }
}