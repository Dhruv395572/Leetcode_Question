// Last updated: 11/11/2025, 2:39:08 PM
class Solution {
    public int reverse(int x) {
        int rev=0;
        int sign= (x<0) ? -1 : 1;
        x = Math.abs(x);
        while(x>0){
            int digit=x%10;
            x=x/10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) return 0;
            rev=(rev*10)+digit;
        }
        
    return rev*sign;
    }
}
