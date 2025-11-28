// Last updated: 11/28/2025, 9:03:00 PM
1class Solution {
2    public boolean isPowerOfFour(int n) {
3        if(n<1){
4            return false;
5        }
6        while (n>1){
7            if(n%4!=0){
8                return false;
9            }
10            n=n/4;
11        }
12        return true;
13    }
14}