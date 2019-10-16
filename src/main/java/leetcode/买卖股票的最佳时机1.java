package leetcode;

public class 买卖股票的最佳时机1 {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length<1) return 0;
        int min =prices[0];
        int max=0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]<min){
                min =prices[i];
            }
            max=Math.max(max, prices[i]-min);
        }
        return max;
    }
}
