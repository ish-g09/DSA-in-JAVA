class Solution {
    public String interpret(String command) {
        StringBuilder str=new StringBuilder();
        int n=command.length();
        for(int i=0; i<n; i++){
            char ch=command.charAt(i);
            if(ch=='G') str.append(
                "G"
            );
            else if(ch=='('){
                String t="";
                
                while(i<n && command.charAt(i)!=')'){
                    t+=command.charAt(i);
                    i++;
                }
                if(t.equals("(")){
                    str.append("o");
                    continue;
                }
                else{
                    str.append("al");
                }
            }
        }
        return str.toString();
    }
}