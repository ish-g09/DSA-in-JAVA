class Solution {
    public String smallestPalindrome(String s) {
        int freq[]=new int[26];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }
        StringBuilder str=new StringBuilder();
        String t="";
        for(int i=0; i<26; i++){
            
                int n=freq[i]/2;
                while(n-->0){
                str.append((char)(i+'a'));
                }
                
            }
            String mid = "";

            for (int i = 0; i < 26; i++) {
                if (freq[i] % 2 == 1) {
                t = String.valueOf((char)(i + 'a'));
                break;
            }
}
            String right = new StringBuilder(str).reverse().toString();
            
            return str.toString()+t+right;

        
    }
}