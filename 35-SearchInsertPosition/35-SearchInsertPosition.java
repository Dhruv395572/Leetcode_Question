// Last updated: 10/26/2025, 10:28:48 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            else if(target<nums[i]){
                return i;
            }
        }
        return nums.length;
    }
}