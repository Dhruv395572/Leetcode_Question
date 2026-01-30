// Last updated: 1/30/2026, 3:00:52 PM
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int st=0;
4        int end=nums.length-1;
5        while(st<=end){
6            int mid=st+(end-st)/2;
7            if(nums[mid]==target) return mid;
8            if(nums[mid]<target){
9                st=mid+1;
10            }
11            else{
12                end=mid-1;
13            }
14        }
15        return st;
16    }
17}