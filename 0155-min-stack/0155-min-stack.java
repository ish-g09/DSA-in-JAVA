class MinStack {
    Stack<int[]>st;
    public MinStack() {
        st=new Stack<>();
    }
    
    public void push(int value) {
        int val=value;
        if(st.isEmpty()) st.push(new int[]{value,value});
        
        else{
            if(st.peek()[1]<val) st.push(new int[]{value, st.peek()[1]});
            else st.push(new int[]{value, value});
        }
    }
    
    public void pop() {
        if(!st.isEmpty()) st.pop();
    }
    
    public int top() {
        if(!st.isEmpty()) return st.peek()[0];
        else return -1;
    }
    
    public int getMin() {
        if(!st.isEmpty()) return st.peek()[1];
        else return -1;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */