class Solution {
    public String removeStars(String s) {
        Stack<Character>st=new Stack<>();
        int n=s.length();
        for(int i=0; i<n; i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)) st.push(ch);
            else st.pop();
        }
        StringBuilder t=new StringBuilder();
        for(char ch: st){
            t.append(ch);
        }
        return t.toString();
    }
}