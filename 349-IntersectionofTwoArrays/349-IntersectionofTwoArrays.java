// Last updated: 11/29/2025, 7:42:18 PM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        Arrays.sort(nums1);
4        Arrays.sort(nums2);
5        int[] temp=new int [Math.min(nums1.length, nums2.length)];
6        int i=0,j=0;
7        int count=0;
8        while(i<nums1.length && j<nums2.length){
9            if(nums1[i]<nums2[j]){
10                i++;
11            }
12            else if(nums1[i]>nums2[j]){
13                j++;
14            }
15            else{
16                if(count == 0 || temp[count - 1] != nums1[i]){
17                    temp[count++] = nums1[i];
18                }
19                i++;
20                j++;
21            }
22        }
23        return Arrays.copyOf(temp, count);
24    }
25}