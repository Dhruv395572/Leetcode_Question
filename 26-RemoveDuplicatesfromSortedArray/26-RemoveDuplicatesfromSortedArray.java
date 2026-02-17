// Last updated: 2/17/2026, 9:47:05 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        LinkedHashSet<Integer> set = new LinkedHashSet<>();
4        for (int num : nums) {
5            set.add(num);
6        }
7        int idx=0;
8        for(int i:set){
9            nums[idx++]=i;
10        }
11        return set.size();
12    }
13}