// Last updated: 11/3/2025, 11:40:21 AM
class Solution {
    public int maxProduct(int n) {
        int rem1=0,max2=1,max=0;
        while(n>0){
            rem1=n%10;
            if(rem1>=max){
                max2=max;
                max=rem1;
            }
            else if(rem1>max2){
                max2=rem1;
            }
            n/=10;
        }
        return max*max2;
    }
}