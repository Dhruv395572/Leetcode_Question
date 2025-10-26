// Last updated: 10/26/2025, 10:34:33 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int a=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[a]){
                a++;
                nums[a]=nums[i];
            }
        }
        return a+1;
    }
}