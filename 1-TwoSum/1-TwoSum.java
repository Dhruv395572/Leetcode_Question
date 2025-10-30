// Last updated: 10/30/2025, 2:38:33 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int[] arr = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for(int j=i+1;j<nums.length;j++){
            sum = nums[i] + nums[j];
            if (target == sum) {
                arr[0] = i;
                arr[1] = j;
                return arr;
            }
            }
        }
        return new int[0];
    }
}