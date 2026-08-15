class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0)
            return 0;        
        int min=prices[0], profit=0, maxProfit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
                continue;
            } else {
                profit = prices[i]-min;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
}
