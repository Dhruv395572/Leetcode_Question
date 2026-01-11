// Last updated: 1/11/2026, 10:17:36 PM
1class Solution {
2    public int secondHighest(String s) {
3        int max1=-1;
4        int max2=-1;
5        char[] arr=s.toCharArray();
6        for(char i:arr){
7            if(Character.isDigit(i)){
8                int num=i-'0';
9                if(num>max1){
10                    max2=max1;
11                    max1=num;
12                }
13            else if(num<max1 && num>max2){
14                max2=num;
15            }
16            }
17        }
18        return max2;
19    }
20}