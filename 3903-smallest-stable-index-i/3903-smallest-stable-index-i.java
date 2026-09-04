class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int prefixmax[]=new int[n];
        int max=nums[0];
        for(int i=0; i<n; i++){
            if(nums[i]>max) max=nums[i];
            prefixmax[i]=max;
        }
        int suffixmin[]=new int[n];
        int min=nums[n-1];
        for(int i=n-1; i>=0; i--){
            if(nums[i]<min) min=nums[i];
            suffixmin[i]=min;
        }
        int ans=n;
        for(int i=0; i<n; i++){
            if(prefixmax[i]-suffixmin[i] <= k) return i;
        }
        return -1;

    }
}