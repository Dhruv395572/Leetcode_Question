// Last updated: 2/6/2026, 2:47:28 PM
1class Solution {
2    public static int sequence(int n){
3        int a=0,b=1,sum=0;
4            if (n == 0) return a;
5            if (n == 1) return b;
6
7            for(int i=2;i<=n;i++){
8                sum=a+b;
9                a=b;
10                b=sum;
11            }
12            return sum;
13    }
14    public int fib(int n) {
15       return sequence(n);
16    }
17}