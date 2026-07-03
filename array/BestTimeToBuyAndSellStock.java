package array;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {

        int bestBuy = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < bestBuy) {
                bestBuy = prices[i];
            }

            int profit = prices[i] - bestBuy;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;

    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        BestTimeToBuyAndSellStock obj = new BestTimeToBuyAndSellStock();

        System.out.println("Max Profit:"+obj.maxProfit(prices));
    }
}