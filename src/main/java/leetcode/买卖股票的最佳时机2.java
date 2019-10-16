package leetcode;

public class 买卖股票的最佳时机2 {
    public int maxProfit(int[] prices) {
        int max=0;
        for (int i = 1; i <prices.length ; i++) {
            if(prices[i]-prices[i-1]>0){
                max+=prices[i]-prices[i-1];
            }
        }
        return max;
    }
}
