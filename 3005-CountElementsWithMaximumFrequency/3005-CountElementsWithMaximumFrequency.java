// Last updated: 1/25/2026, 11:28:53 PM
1import java.util.*;
2
3class Solution {
4    public int maxFrequencyElements(int[] nums) {
5        Map<Integer, Integer> freq = new HashMap<>();
6            for (int num : nums) {
7                freq.put(num, freq.getOrDefault(num, 0) + 1);
8            }
9            int maxFreq = Collections.max(freq.values());
10            int count = 0;
11            for (int val : freq.values()) {
12                if (val == maxFreq) count++;
13            }
14            return maxFreq * count;
15    }
16}