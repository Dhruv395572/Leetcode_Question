// Last updated: 11/20/2025, 3:01:02 PM
class Solution {
    public int maxProfit(int[] prices) {
        int min=9999999;
        int max=0;
        for(int price:prices){
            if(price<min){
                min=price;
            }
            else if (price - min > max){
                max= price - min;
            }
        }
        return max;
    }
}