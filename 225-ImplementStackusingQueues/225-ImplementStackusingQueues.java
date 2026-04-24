// Last updated: 4/24/2026, 10:14:00 PM
1class MinStack {
2
3    Stack<Integer> st; 
4    Stack<Integer> minst; 
5    public MinStack() {
6        minst=new Stack<>();
7        st=new Stack<>();
8    }
9    
10    public void push(int val) {
11        st.push(val);
12        if(minst.isEmpty()){
13            minst.push(val);
14        }
15        else{
16            minst.push(Math.min(val,minst.peek()));
17        }
18    }
19    
20    public void pop() {
21        st.pop();
22        minst.pop();
23    }
24    
25    public int top() {
26        return st.peek();
27    }
28    
29    public int getMin() {
30        return minst.peek();
31    }
32}
33
34/**
35 * Your MinStack object will be instantiated and called as such:
36 * MinStack obj = new MinStack();
37 * obj.push(val);
38 * obj.pop();
39 * int param_3 = obj.top();
40 * int param_4 = obj.getMin();
41 */