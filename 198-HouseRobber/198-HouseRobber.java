// Last updated: 11/25/2025, 2:28:58 PM
class Solution {
        public int rob(int[] nums) {
        int pre1=0;
        int pre2=0;
        for(int num:nums){
            int sum=num+pre2;
            int skip=pre1;
            int max=Math.max(sum,skip);
            pre2=pre1;
            pre1=max;
        }
        return pre1;
    }
}