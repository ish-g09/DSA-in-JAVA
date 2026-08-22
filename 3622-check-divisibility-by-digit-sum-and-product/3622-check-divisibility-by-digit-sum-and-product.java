class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        int k=n;
        while(k!=0){
            int digit=k%10;
            k/=10;
            product*=digit;
            sum+=digit;

        }
        if(n%(sum+product)==0) return true;
        return false;
    }
}