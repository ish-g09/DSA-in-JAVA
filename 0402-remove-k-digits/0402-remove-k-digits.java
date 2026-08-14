class Solution {
    public String removeKdigits(String num, int k) {
        int n=num.length();
        // int number=String.valueOf(num);
        Stack<Integer>st=new Stack<>();
        int i=0;
        while(i<n){
            char ch=num.charAt(i);
            while(!st.isEmpty() && k>0 && st.peek()>ch-'0'){
                st.pop();
                k--;
            }
            st.push(ch-'0');
            i++;
        }
         while (k > 0) {
            st.pop();
            k--;
        }
        StringBuilder s=new StringBuilder();
        for
        (int x:st){
            s.append((char)(x+'0'));
        }
        // for(int j=i; j<n; j++){
        //     s.append(num.charAt(j));
        // }
        int j = 0;
        while (j<s.length() && s.charAt(j)=='0') {
            j++;
        }

        s=new StringBuilder(s.substring(j));

        if (s.length() == 0) {
            return "0";
        }

        return s.toString();
    }
}