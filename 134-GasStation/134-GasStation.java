// Last updated: 12/1/2025, 7:02:12 PM
1class Solution {
2    public int canCompleteCircuit(int[] gas, int[] cost) {
3        int n=gas.length;
4        int gassum=0,costsum=0;
5        int start=0,tank=0;
6        for(int i=0;i<n;i++){
7            gassum=gassum + gas[i];
8            costsum=costsum+cost[i];
9            tank+=gas[i]-cost[i];
10            if(tank<0){
11                start=i+1;
12                tank=0;
13            }
14        }
15        if(gassum<costsum){
16            return -1;
17        }
18        return start;
19    }
20}