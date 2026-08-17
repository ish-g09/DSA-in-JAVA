class Solution {
    int i=0;
    public String decodeString(String s) {
        return decode(s);
    }
    String decode(String s){
        String result="";
        // Stack<String>st=new Stack<>();
        while(i<s.length() && s.charAt(i)!=']'){
            
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                int times=0;
                while(i<s.length() && s.charAt(i)!='['){
                    times=times*10+(s.charAt(i)-'0');
                    i++;
                }

            
            i++;
            String needed=decode(s);
            i++;
            while(times>0){
                result+=(needed);
                times--;
            }
            }
            else{
                result+=(ch);
                i++;
            }
            

        }
        
        
        return result;
    }
}