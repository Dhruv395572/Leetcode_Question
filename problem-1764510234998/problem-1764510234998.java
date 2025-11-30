// Last updated: 11/30/2025, 7:13:54 PM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int n=nums.length;
4        int max2=0;
5        int max=0;
6        for(int i=0;i<n;i++){
7            if(nums[i]==1){
8                max++;
9            }
10            else if(nums[i]==0){
11                max=0;
12            }
13            if(max>max2){
14                max2=max;
15            }
16        }
17        return max2;
18    }
19}