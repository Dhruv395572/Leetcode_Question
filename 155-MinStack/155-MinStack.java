// Last updated: 4/3/2026, 3:24:06 PM
1class MinStack {
2    private Stack<Integer> st;
3    private Stack<Integer> minSt;
4public MinStack() {
5    st = new Stack<>();
6    minSt = new Stack<>();
7    }
8    public void push(int val) {
9        st.push(val);
10        if (minSt.isEmpty() || val <= minSt.peek()) {                                                                          minSt.push(val);
11}
12}
13public void pop() {
14    if (st.peek().equals(minSt.peek())) {
15        minSt.pop();
16    }
17    st.pop();
18    }
19public int top() {
20    return st.peek();
21}
22public int getMin() {
23    return minSt.peek();
24}
25}
26