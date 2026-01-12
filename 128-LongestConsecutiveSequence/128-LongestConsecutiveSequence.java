// Last updated: 1/12/2026, 9:02:43 PM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        if(nums.length==0)return 0;
4        int count=1;
5        int Maxcount=1;
6        Arrays.sort(nums);
7        for(int i=0;i<nums.length-1;i++){
8            if(nums[i]==nums[i+1]){
9                continue;
10            }
11            else if(nums[i]+1==nums[i+1]){
12                count++;
13            }
14            else{
15                count=1;
16            }
17            Maxcount=Math.max(count,Maxcount);
18        }
19        return Maxcount;
20    }
21}