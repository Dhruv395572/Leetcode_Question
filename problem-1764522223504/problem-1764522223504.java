// Last updated: 11/30/2025, 10:33:43 PM
1class Solution {
2    public int jump(int[] nums) {
3        int idx=0,curr=0,count=0;
4        int n=nums.length;
5        if(nums[0]==0){
6            return 0;
7        }
8        else{
9            for(int i=0;i<n-1;i++){
10                idx=Math.max(idx,i+nums[i]);
11                if(curr==i){
12                    curr=idx;
13                    count++;
14                }
15                if(curr>n-1){
16                    return count;
17                }
18            }
19        }
20        
21        return count;
22    }
23}