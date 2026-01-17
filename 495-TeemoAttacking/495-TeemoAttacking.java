// Last updated: 1/17/2026, 11:44:22 PM
1class Solution {
2    public int findPoisonedDuration(int[] timeSeries, int duration) {
3        if (timeSeries.length == 0) return 0;
4        int total = 0;
5        for (int i = 0; i < timeSeries.length - 1; i++) {
6            total += Math.min(duration, timeSeries[i+1] - timeSeries[i]);
7        }
8        total += duration;
9
10        return total; 
11    }
12}