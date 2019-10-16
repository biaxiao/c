package leetcode;

public class 最佳买卖股票时机含冷冻期 {

    public int maxProfit(int[] prices) {
        if(prices==null||prices.length<2) return 0;
        int len = prices.length;
        int[] buy= new int[len];
        int[] sell= new int[len];
        buy[0]=-prices[0];
        buy[1]=Math.max(buy[0],-prices[1]);
        sell[0]=0;
        sell[1]=Math.max(sell[0], prices[1]-prices[0]);
        for (int i = 2; i <prices.length ; i++) {
            buy[i]=Math.max(buy[i-1],sell[i-2]-prices[i]);
            sell[i]=Math.max(sell[i-1], prices[i]+buy[i-1]);
        }
        return Math.max(buy[len-1],sell[len-1] );
    }
}
