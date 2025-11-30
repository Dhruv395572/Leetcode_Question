// Last updated: 11/30/2025, 9:04:23 PM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int idx=0;
4        int n=nums.length;
5        for(int i=0;i<n;i++){
6            if(idx<i){
7                return false;
8            }
9            idx=Math.max(idx,i+nums[i]);
10            if(idx>nums.length){
11                return true;
12            }
13        }
14        return true;
15    }
16}