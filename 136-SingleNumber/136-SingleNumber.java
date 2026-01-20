// Last updated: 1/20/2026, 9:07:54 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3        if(nums.length==1) return nums[0];
4        int n=nums.length;
5        int ans =0;
6        for(int i=0;i<n;i++){
7            ans=ans^nums[i];
8        }
9        return ans;
10    }
11}