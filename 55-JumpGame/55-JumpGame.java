// Last updated: 2/6/2026, 10:00:29 PM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int goal=nums.length-1;
4        for(int i=nums.length-2;i>=0;i--){
5            if(i+nums[i]>=goal){
6                goal=i;
7            }
8        }
9            if(goal==0){
10                return true;
11            }
12        return false;
13    }
14}