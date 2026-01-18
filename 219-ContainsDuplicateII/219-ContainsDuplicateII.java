// Last updated: 1/18/2026, 11:14:27 PM
1class Solution {
2        public boolean containsNearbyDuplicate(int[] nums, int k) {
3            HashMap<Integer, Integer> map = new HashMap<>();
4            for (int i = 0; i < nums.length; i++) {
5                if (map.containsKey(nums[i])) {
6                    int prevIndex = map.get(nums[i]);
7                    if (i - prevIndex <= k) {
8                        return true;
9                    }
10                }                                                                                                              map.put(nums[i], i);
11            }
12        return false;
13        }
14
15}