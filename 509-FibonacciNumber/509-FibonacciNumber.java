// Last updated: 11/29/2025, 11:25:59 PM
1class Solution {
2    public int fib(int n) {
3        int a=0,b=1,sum=0;
4        if(n==1){
5            return n;
6        }
7        for(int i=0;i<n-1;i++){
8            sum=a+b;
9            a=b;
10            b=sum;
11        }
12        return sum;
13    }
14}