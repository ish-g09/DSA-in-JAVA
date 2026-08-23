class Solution {
    public boolean sumGame(String num) {
        int n=num.length();
        int leftsum=0;
        int rightsum=0;
        int leftq=0;
        int rightq=0;
        for(int i=0; i<n/2; i++){
            char ch=num.charAt(i);
            if(ch!='?'){
            int digit = ch - '0';
            leftsum+=digit;
            }
            else leftq++;
        }
         for(int i=n/2; i<n; i++){
            char ch=num.charAt(i);
            if(ch!='?'){
            int digit = ch - '0';
            rightsum+=digit;
            }
            else rightq++;
        }
        if((leftq+rightq)%2==1){
            return true;
        }
        int diff=leftsum-rightsum;
        int required=9*(rightq-leftq)/2;

        return diff!=required;
    }
}