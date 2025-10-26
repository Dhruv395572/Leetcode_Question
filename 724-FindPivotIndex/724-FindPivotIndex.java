// Last updated: 10/26/2025, 10:32:01 PM
class Solution {
    public int pivotIndex(int[] nums) {
        int total=0;
        int left=0;
        for (int num:nums){
            total+=num;
        }
        for (int i=0;i<nums.length;i++){
            if(left==total-left-nums[i]){
                return i;
            }
            left+=nums[i];
        }
        return -1;
    }
}