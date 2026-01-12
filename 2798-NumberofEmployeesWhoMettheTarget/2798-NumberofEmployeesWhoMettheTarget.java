// Last updated: 1/12/2026, 8:20:56 PM
1class Solution {
2    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
3        
4        int count=0; 
5        for(int i:hours){
6            if(i>=target){
7                count++;
8            }
9        }
10        return count;
11    }
12}