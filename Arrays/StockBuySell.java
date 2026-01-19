package Arrays;

public class StockBuySell {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int n = prices.length;
        int maxProfit = 0;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(min>prices[i]){
                min = prices[i];
            }
            int profit = prices[i]-min;
            maxProfit = Math.max(maxProfit, profit);
        }

        System.out.println(maxProfit);

    }
}
