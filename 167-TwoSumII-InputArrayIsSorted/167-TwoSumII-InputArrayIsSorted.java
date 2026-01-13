// Last updated: 1/13/2026, 7:30:14 PM
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int st=0;
4        int en=numbers.length-1;
5        while(st<en){
6            int sum=numbers[st]+numbers[en];
7            if(sum==target){
8                return new int[] {st+1,en+1};
9            }
10            else if(sum>target){
11                en--;
12            }
13            else if(sum<target){
14                st++;
15            }
16        }
17        return new int[] {-1,-1};
18    }
19}