// Last updated: 12/3/2025, 11:32:02 AM
1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        int n=nums.length;
4        List<Integer> list=new ArrayList<>();
5        for(int i=0;i<n;i++){
6            int idx = Math.abs(nums[i]) - 1;
7            if(nums[idx]>0){
8                nums[idx] = -nums[idx];
9            }
10        }
11        for(int i=0;i<n;i++){
12            if(nums[i]>0){
13                list.add(i+1);
14            }
15        }
16        return list;
17    }
18}