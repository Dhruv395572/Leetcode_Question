// Last updated: 11/1/2025, 5:37:06 PM
class Solution {
    public int[] productExceptSelf(int[] nums) {
     int n=nums.length;
     int[] set =new int[n];
     int right=1;
     set[0]=1;
     for(int i=1;i<n;i++){
        set[i]=set[i-1]*nums[i-1];
     }
     for(int i=n-1;i>=0;i--){
        set[i]*=right;
        right*=nums[i];
     }
     return set;
    }
}