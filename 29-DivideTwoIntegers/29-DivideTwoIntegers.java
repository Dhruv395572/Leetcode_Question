// Last updated: 10/26/2025, 10:28:35 PM
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        return dividend / divisor; 
       }
    }