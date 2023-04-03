public class BestTimetoBuyAndSellStockTwo {

    public int maxProfit(int[] prices) {
        /*
            profit : maximum total profit
            buy : the day when buy stock
            sell: the day when sell stock
            days: maximum trade days
         */

        int profit=0, buy =0, sell=0, days = prices.length;

        while (buy < days && sell < days) {
            while(buy < days-1 && prices[buy+1] < prices[buy])
                buy++; // find the valley of prices
            sell = buy;

            while(sell < days-1 && prices[sell] < prices[sell+1])
                sell++; // find the peak of prices

            profit += prices[sell]- prices[buy];
            buy = sell+1;
        }
        return profit;
    }

}
