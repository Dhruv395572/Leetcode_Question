// Last updated: 1/15/2026, 8:17:54 PM
1class Solution {
2    public int findPeakElement(int[] nums) {
3        int max=0;
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]>nums[max]){
6                max=i;
7            }
8        }
9        return max;
10    }
11}