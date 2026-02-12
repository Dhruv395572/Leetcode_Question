// Last updated: 2/12/2026, 4:11:15 PM
1class Solution {
2        public static int series(int n){
3                if(n<3) return n;
4                        int a=1,b=2,sum=0;
5                                for(int i=3;i<=n;i++){
6                                            sum=a+b;
7                                                        a=b;
8                                                                    b=sum;
9                                                                            }
10                                                                                    return sum;
11                                                                                        }
12                                                                                            public int climbStairs(int n) {
13                                                                                                    return series(n);
14                                                                                                        }
15                                                                                                        }
16