class Solution {
    boolean isNumber(String s) {
    try {
        Integer.parseInt(s);
        return true;
    } catch (Exception e) {
        return false;
    }
    }
    int getval(int a, int b, String s) {
    if (s.equals("+")) return a + b;
    else if (s.equals("-")) return a - b;
    else if (s.equals("*")) return a * b;
    else return a / b;
    }
    public int evalRPN(String[] tokens) {
        
        int n=tokens.length;
        Stack<Integer>st=new Stack<>();
        for(int i=0; i<n; i++){
            if(isNumber(tokens[i])){
                int t=Integer.parseInt(tokens[i]);
                st.push(t);
            }
            else{
                int b=st.pop();
                int a=st.pop();
                int res=getval(a,b,tokens[i]);
                st.push(res);
            }
        }
        return st.pop();
    }
}