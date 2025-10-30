// Last updated: 10/30/2025, 2:53:16 PM
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]%2>nums[j]%2){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }
}