class Solution {
    boolean isPalindrome(String str){
        
        int left=0;
        int right=str.length()-1;
        while(left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    String getBase(int i, int n){
        StringBuilder res=new StringBuilder();
        int num=n;
        while(num>=1){
            int digit=num%i;
            res.append(digit);
            num/=i;
        }
        res.reverse();
        String str=res.toString();
        return str;
    }
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2; i<=n-1; i++){
            String baseN=getBase(i,n);
            if(!isPalindrome(baseN)) return false;
        }
        return true;
    }
}