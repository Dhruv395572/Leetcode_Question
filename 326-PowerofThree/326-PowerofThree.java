// Last updated: 11/28/2025, 9:02:42 PM
1class Solution {
2    public boolean isPowerOfThree(int n) {
3        if(n<1){
4            return false;
5        }
6        else{
7            while(n>1){
8                if(n%3!=0){
9                    return false;
10                }
11                n/=3;
12            }
13        }
14        return true;
15    }
16}