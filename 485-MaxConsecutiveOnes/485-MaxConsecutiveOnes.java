// Last updated: 11/13/2025, 2:47:49 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int max2=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                max++;
            }
            else if(nums[i]==0){
                max=0;
            }
            if(max>max2){
                max2=max;
            }
        }
        return max2;
    }
}