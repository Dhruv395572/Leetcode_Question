// Last updated: 12/1/2025, 9:02:24 PM
1class Solution {
2    public int trap(int[] height) {
3        int lmax=0,l=0,rmax=0,r=height.length-1,water=0;
4        while(l<r){
5            if(height[l]<height[r]){
6                if(height[l]>lmax){
7                    lmax=height[l];
8                }
9                else{
10                    water+=lmax-height[l];
11                }
12                l++;
13            }
14            else{
15                if(height[r]>rmax){
16                    rmax=height[r];
17                }
18                else{
19                    water+=rmax-height[r];
20                }
21                r--;
22            }
23           
24        }
25        return water;
26    }
27}