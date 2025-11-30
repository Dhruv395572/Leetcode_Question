// Last updated: 11/30/2025, 10:45:41 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int min=9999999;
4        int max=0;
5        for(int price:prices){
6            if(price<min){
7                min=price;
8            }
9            else if (price - min > max){
10                max= price - min;
11            }
12        }
13        return max;
14    }
15}