// Last updated: 1/12/2026, 9:20:48 PM
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        Arrays.sort(nums);
4        int n=nums.length;
5        for(int i=0;i<n-1;i++){
6            if(nums[i]==nums[i+1]){
7                return true;
8            }
9        }
10        return false;
11    }
12}