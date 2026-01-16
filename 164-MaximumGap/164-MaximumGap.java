// Last updated: 1/16/2026, 2:26:08 PM
1class Solution {
2    public int maximumGap(int[] nums) {
3        int max=0;
4        Arrays.sort(nums);
5        for(int i=0;i<nums.length-1;i++){
6            if(nums[i+1]-nums[i]>max){
7                max=nums[i+1]-nums[i];
8            }
9        }
10        return max;
11    }
12}