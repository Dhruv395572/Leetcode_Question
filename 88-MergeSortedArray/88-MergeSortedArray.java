// Last updated: 11/15/2025, 10:40:32 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<n;i++){
            nums1[m+i]=nums2[i];
        }   
        Arrays.sort(nums1);
    }
}