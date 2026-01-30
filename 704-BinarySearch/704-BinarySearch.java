// Last updated: 1/30/2026, 2:18:03 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int st=0;
4        int end=nums.length-1;
5        while(st<=end){
6            int mid=st+(end-st)/2;
7            if(nums[mid]==target) return mid;
8            if(target>nums[mid]){
9                st=mid+1;
10            }
11            else{
12                end=mid-1;
13            }
14        }
15        return -1;
16    }
17}