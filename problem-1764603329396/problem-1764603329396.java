// Last updated: 12/1/2025, 9:05:29 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int sum = 0;
4        int[] arr = new int[2];
5        for (int i = 0; i < nums.length - 1; i++) {
6            for(int j=i+1;j<nums.length;j++){
7            sum = nums[i] + nums[j];
8            if (target == sum) {
9                arr[0] = i;
10                arr[1] = j;
11                return arr;
12            }
13            }
14        }
15        return new int[0];
16    }
17}