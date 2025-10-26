// Last updated: 10/26/2025, 10:33:17 PM
class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int temp=x;
        while(x>0){
            int digit=x%10;
            rev=rev*10+digit;
            x=x/10;
        }
        if(temp==rev){
            return true;
        }
        else{
            return false;
        }
    }
}