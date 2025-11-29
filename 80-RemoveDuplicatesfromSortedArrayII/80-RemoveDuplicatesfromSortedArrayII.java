// Last updated: 11/29/2025, 10:25:05 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int n=nums.length;
4        int k=0;
5        for(int num:nums){
6            if(k<2 || num!=nums[k-2]){
7                nums[k]=num;
8                k++;
9            }
10        }
11        return k;
12    }
13}