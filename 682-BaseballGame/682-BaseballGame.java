// Last updated: 4/25/2026, 3:07:38 PM
1class Solution {
2    public int calPoints(String[] operations) {
3        Stack<Integer> st= new Stack<>();
4        for(String op:operations){
5            if(op.equals("C")){
6                st.pop();
7            }
8            else if(op.equals("D")){
9                st.push(2*st.peek());
10            }
11            else if(op.equals("+")){
12                int Top=st.pop();
13                int newTop=Top+st.peek();
14                st.push(Top);
15                st.push(newTop);
16            }
17            else{
18                st.push(Integer.parseInt(op));
19            }
20        }
21        int sum=0;
22        for(int i:st){
23            sum+=i;
24        }
25        return sum;
26    }
27}