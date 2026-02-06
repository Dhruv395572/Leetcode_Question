// Last updated: 2/6/2026, 11:37:24 AM
1class Solution {
2    public int distributeCandies(int[] candyType) {
3    HashSet<Integer> set=new HashSet<>();
4    for(int i:candyType){
5        set.add(i);
6    }       
7    int unique=set.size();
8    int allowed=candyType.length/2;
9    return Math.min(unique,allowed);
10    }
11}