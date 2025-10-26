// Last updated: 10/26/2025, 10:31:23 PM
class Solution {
    public int[] buildArray(int[] nums) {
        int [] ans=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}