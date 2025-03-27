package TUF_SDE_SHEET.Array.Medium;

public class StockBuyAndSell {

    public static int maxProfit(int[] prices) {
        int buy = prices[0], maxProfit = 0;

        for(int i=1; i< prices.length; ++i) {
            int profit = prices[i] - buy;

            if(profit > maxProfit) {
                maxProfit = profit;
            }

            if(buy > prices[i]) {
                buy = prices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
