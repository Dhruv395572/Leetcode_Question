// Last updated: 10/26/2025, 10:32:28 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
        int sq=0;
        for (int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}