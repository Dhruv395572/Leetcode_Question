// Last updated: 4/23/2026, 11:41:34 PM
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> st=new Stack<>();
4        for (char ch:s.toCharArray()){
5            if(ch=='(' || ch=='{' || ch=='['){
6                st.push(ch);
7            }
8            else{
9                if(st.isEmpty())return false;
10
11                char top=st.pop();
12                if ((ch == ')' && top != '(') ||
13                (ch == '}' && top != '{') ||
14                (ch == ']' && top != '[')) {
15                return false;
16                }
17            }
18        }
19        return st.isEmpty();
20    }
21}