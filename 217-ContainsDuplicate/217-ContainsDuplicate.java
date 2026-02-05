// Last updated: 2/5/2026, 3:05:42 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        HashMap<Character,Integer>ang=new HashMap<>();
4        for(char i:s.toCharArray()){
5            ang.merge(i,1,Integer::sum);
6        }
7        for(char i:t.toCharArray()){
8            ang.merge(i,-1,Integer::sum);
9        }
10        for(int i:ang.values()){
11            if(i!=0){
12                return false;
13            }
14        }
15        return true;
16    }
17}