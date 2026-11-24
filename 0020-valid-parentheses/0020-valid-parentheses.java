class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character>st=new Stack<>();
        
        for(int i=0; i<n; i++){
            char ch=s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            }
            else{
                if(ch==')'){
                    if(st.peek()!='('){
                        return false;
                    }
                    else{
                        st.pop();
                    }
                }

                else if(ch=='}'){
                    if(st.peek()!='{'){
                        return false;
                    }
                    else st.pop();
                }
                
                else if(ch==']'){
                    if(st.peek()!='[') return false;
                    else st.pop();
                }
                else st.push(ch);

            }
        }
        return st.isEmpty();
    }
}