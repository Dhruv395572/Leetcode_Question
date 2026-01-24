// Last updated: 1/24/2026, 10:48:58 PM
1class Solution {
2    public void sortColors(int[] nums) {
3        int x=0,y=0,z=0;
4        for(int i:nums){
5            if(i==0) x++;
6            else if(i==1) y++;
7            else z++;
8        }
9        int idx=0;
10        for(int i=0;i<x;i++) nums[idx++]=0;
11        for(int i=0;i<y;i++) nums[idx++]=1;
12        for(int i=0;i<z;i++) nums[idx++]=2;
13
14        
15    }
16}