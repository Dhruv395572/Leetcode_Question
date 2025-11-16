// Last updated: 11/16/2025, 1:53:15 PM
class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>nums.length/2){
                return nums[i];
            }
        }
       return -1;
    }
}