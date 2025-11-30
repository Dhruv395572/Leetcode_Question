// Last updated: 11/30/2025, 7:37:49 PM
1class Solution {
2    public int[] findErrorNums(int[] nums) {
3        int n=nums.length;
4        int []array=new int[2];
5        int []frq=new int[n+1];
6        int k=0;
7        for(int x:nums){
8            frq[x]++;
9        }
10        int dup=0,mis=0;
11        for(int i=1;i<=n;i++){
12            if(frq[i]==2){
13                dup=i;
14            }
15            if(frq[i]==0){
16                mis=i;
17            }
18        }
19        array[0]=dup;
20        array[1]=mis;
21        return array;
22    }
23}