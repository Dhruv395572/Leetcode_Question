// Last updated: 1/14/2026, 2:58:36 PM
1import java.lang.Math;
2class Solution {
3    public int maxArea(int[] height) {
4        int n=height.length;
5        int max=0;
6        int i = 0, j = height.length - 1;
7        int mul=0;
8        int sub=0;
9        int h=0;
10        while(i<j){
11            h=Math.min(height[i],height[j]);
12            sub=Math.abs(j-i);
13            mul=sub*h;
14            if(mul>max){
15                max=mul;
16            }    
17            if(height[i]<height[j]){
18                i++;
19            }
20            else{
21                j--;
22            }
23        }
24        return max;
25    }
26}