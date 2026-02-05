// Last updated: 2/5/2026, 3:17:58 PM
1class Solution {
2    public int majorityElement(int[] nums) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        for(int i:nums){
5            map.merge(i,1,Integer::sum);
6        }
7        for (int key : map.keySet()) {
8            if (map.get(key) > nums.length / 2) {
9                return key;
10            } 
11        }
12        return -1;
13    }
14}