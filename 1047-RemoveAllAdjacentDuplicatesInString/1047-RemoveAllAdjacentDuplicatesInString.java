// Last updated: 4/24/2026, 10:42:34 PM
1class Solution {
2    public String removeDuplicates(String s) {
3        Stack<Character> st=new Stack<>();
4        for(char ch:s.toCharArray()){
5            if(!st.isEmpty() && st.peek()==ch){
6                st.pop();
7            }
8            else{
9                st.push(ch);
10            }
11
12        }
13        StringBuilder sb= new StringBuilder();
14        for(char c: st){
15            sb.append(c);
16        }
17        return sb.toString();
18    }
19}