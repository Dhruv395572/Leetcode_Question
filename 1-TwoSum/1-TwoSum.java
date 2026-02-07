// Last updated: 2/7/2026, 11:56:45 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        int n=nums.length;
5        for(int i=0;i<n;i++){
6            int sub=target-nums[i];
7            if(map.containsKey(sub)){
8                return new int[]{map.get(sub),i};
9            }
10            map.put(nums[i], i);
11        }
12        return new int[]{};
13                                                                                                                }
14}
15