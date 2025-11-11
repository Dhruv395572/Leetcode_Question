// Last updated: 11/11/2025, 10:25:31 AM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<1){
            return false;
        }
        while (n>1){
            if(n%4!=0){
                return false;
            }
            n=n/4;
        }
        return true;
    }
}