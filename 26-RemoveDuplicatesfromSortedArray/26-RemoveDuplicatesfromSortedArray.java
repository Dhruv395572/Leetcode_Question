// Last updated: 11/30/2025, 10:35:13 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int a=0;
4        for(int i=1;i<nums.length;i++){
5            if(nums[i]!=nums[a]){
6                a++;
7                nums[a]=nums[i];
8            }
9        }
10        return a+1;
11    }
12}