class Solution {
    public int maxProfit(int[] prices) {
        int profit=0,min=prices[0];
        int i,temp=0;
        for(i=1;i<prices.length;i++)
        {
            if(min>prices[i])
            {
                min=prices[i];
            }
            else if(profit<(prices[i]-min))
            {
                profit=prices[i]-min;
            }
        }
        return profit;
    }
}
