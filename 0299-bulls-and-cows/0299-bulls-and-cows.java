class Solution {
    public String getHint(String secret, String guess) {
        int cow=0;
        int bull=0;
        int freq[]=new int[10];
        for(int i=0; i<secret.length(); i++){
            freq[secret.charAt(i)-'0']++;
        }
        for(int i=0; i<secret.length(); i++){
            if(secret.charAt(i)==guess.charAt(i)){
                bull++;
                freq[secret.charAt(i)-'0']--;
            }
        }
        
        for(int i=0; i<guess.length(); i++){
            char ch=guess.charAt(i);
            if(secret.charAt(i)==guess.charAt(i)) continue;
            if(freq[ch-'0']>0){
                cow++;
                freq[ch-'0']--;
            }
        }
        String str=bull+"A"+cow+"B";
        return str;
    }
}