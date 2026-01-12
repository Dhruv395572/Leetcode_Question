// Last updated: 1/12/2026, 9:51:52 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if (s.length() != t.length()) {
4            return false;
5        }
6
7        int[] freq = new int[26];
8        for(int i=0;i<s.length();i++){
9            freq[s.charAt(i)-'a']++;
10            freq[t.charAt(i)-'a']--;
11        }
12        for (int i = 0; i < 26; i++) {
13            if (freq[i] != 0) {
14                return false;
15            }
16        }
17        return true;
18
19    }
20}