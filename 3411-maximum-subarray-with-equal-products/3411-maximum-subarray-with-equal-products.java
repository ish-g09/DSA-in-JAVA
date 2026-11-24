class Solution {
    private int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    
    public int maxLength(int[] nums) {
        if(nums.length<=1) return nums.length;
        int max=2;
        
        for(int i=0; i<nums.length; i++){
            int g=1;
            int l=1;
            long prod=1;
            for(int j=i; j<nums.length; j++){
                g=gcd(g, nums[i]);
                prod*=nums[j];
                l=(l/gcd(l, nums[j]))*nums[j];
                if(prod==l*g) max=Math.max(j-i+1, max);
            }
        }
        return max;

    }
}