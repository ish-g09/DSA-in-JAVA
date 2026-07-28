class Solution {
    public String simplifyPath(String path) {
        Stack<String>st=new Stack<>();
        String p[]=path.split("/");
        for(String s:p){
            if(s.equals("") || s.equals(".")) continue;
            if(s.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else st.push(s);
        }
        StringBuilder str=new StringBuilder();
        for(String s:st){
            str.append("/");
            str.append(s);
        }
        if(str.isEmpty()) return("/");
        return str.toString();
    }
}