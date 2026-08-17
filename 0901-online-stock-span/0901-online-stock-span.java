class Pair{
    int value;
    int span;
    Pair(int value, int span){
        this.value=value;
        this.span=span;
    }
}
class StockSpanner {
    Stack<Pair>st;
    public StockSpanner() {
        st=new Stack<>();
    }
    
    public int next(int price) {
        
        int cnt=1;
        while(!st.isEmpty() && st.peek().value<=price){
            Pair p=st.pop();
            cnt+=p.span;
            

        }
        st.push(new Pair(price,cnt));
        return st.peek().span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */