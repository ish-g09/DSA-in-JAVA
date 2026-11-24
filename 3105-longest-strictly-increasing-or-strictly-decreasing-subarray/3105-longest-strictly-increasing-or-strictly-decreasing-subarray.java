class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc=0;
        int dec=0;
        int n=nums.length;
        if(n<=1) return n;
        for(int i=0; i<n-1; i++){
            int j=i;
            while(j<n-1 && nums[j+1]>nums[j]) j++;
            inc=Math.max(j-i+1, inc);
            i=j;
        }
        for(int i=0; i<n-1; i++){
            int j=i;
            while(j<n-1 && nums[j+1]<nums[j]) j++;
            dec=Math.max(j-i+1, dec);
            i=j;
        }
        return Math.max(dec, inc);
    }
}