// Last updated: 2/9/2026, 8:10:07 PM
1class Solution {
2    public boolean check(int[] nums) {
3        int n=nums.length;
4        int count=0;
5        for(int i=0;i<n;i++){
6            if(nums[i]>nums[(i+1)%n]){
7                count++;
8            }
9        }
10        if(count>1){
11            return false;
12        }
13        return true;
14    }
15}