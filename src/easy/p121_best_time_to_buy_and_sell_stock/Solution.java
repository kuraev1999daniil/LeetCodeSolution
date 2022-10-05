package easy.p121_best_time_to_buy_and_sell_stock;

public class Solution {

    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;

        int buy = 0;

        int minPrice = prices[0];
        int maxPrice = prices[0];

        for (var price : prices) {
            if (minPrice > price) {
                minPrice = price;
                maxPrice = price;

                continue;
            }

            if (maxPrice < price) {
                maxPrice = price;
                int difference = maxPrice - minPrice;
                if (buy < difference) {
                    buy = maxPrice - minPrice;
                }
            }
        }

        return buy;
    }
}
