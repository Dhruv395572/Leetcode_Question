// Last updated: 11/30/2025, 7:13:21 PM
1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        
4        int []array=new int[n*2];
5        int j=0;
6        for(int i=0;i<n;i++){
7          array[j++]=nums[i];
8          array[j++]=nums[i+n];  
9        }
10        return array;
11    }
12}