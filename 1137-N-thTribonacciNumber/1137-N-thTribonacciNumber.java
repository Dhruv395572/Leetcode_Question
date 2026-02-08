// Last updated: 2/8/2026, 3:26:43 PM
1class Solution {
2    public static int series(int n){
3        int a=0, b=1, c=1;
4        if(n==0) return 0;
5        if(n==1) return 1;
6        if(n==2) return 1;
7        int sum=0;
8        for(int i=3;i<=n;i++){
9            sum=a+b+c;
10            a=b;
11            b=c;
12            c=sum;
13        }
14        return sum;
15    }
16    public int tribonacci(int n) {
17        return series(n);
18    }
19}