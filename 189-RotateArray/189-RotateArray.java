// Last updated: 11/30/2025, 11:40:54 AM
1class Solution {
2    public void rotate(int[] nums, int k) {
3        int n=nums.length;
4        k=k%n;
5        reverse(0,n-1,nums);
6        reverse(0,k-1,nums);
7        reverse(k,n-1,nums);
8
9    }
10    public static void reverse(int i,int j,int[] nums){
11        while(i<j){
12            int temp=nums[i];
13            nums[i]=nums[j];
14            nums[j]=temp;
15            i++;
16            j--;
17        }
18    }
19}