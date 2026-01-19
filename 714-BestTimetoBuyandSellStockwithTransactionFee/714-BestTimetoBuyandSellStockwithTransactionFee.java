// Last updated: 1/19/2026, 9:35:36 PM
1class Solution {
2    public int maxProfit(int[] prices, int fee) {
3        int hold=-prices[0];
4        int cash=0;
5        for(int i = 1; i < prices.length; i++){
6            hold = Math.max(hold, cash - prices[i]);
7            cash = Math.max(cash, hold + prices[i] - fee);
8        }
9        return cash;
10    }
11}