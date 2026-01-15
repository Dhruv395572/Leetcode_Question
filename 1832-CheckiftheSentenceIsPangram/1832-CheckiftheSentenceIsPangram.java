// Last updated: 1/15/2026, 9:11:38 PM
1class Solution {
2    public boolean checkIfPangram(String sentence) {
3        int n=sentence.length();
4        if(n<26) return false;
5        int freq[]=new int[26];
6        for(int i=0;i<n;i++){
7            freq[sentence.charAt(i)-'a']++;
8        }
9        for(int i:freq){
10            if(i==0){
11                return false;
12            }
13        }
14        return true;
15    }
16}