class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int maxSum=nums[0];
        int minSum=nums[0];
        int cMax=nums[0];
        int cMin=nums[0];
        int t=nums[0];
        for(int i=1; i<n; i++){
            t+=nums[i];
            cMax=Math.max(nums[i], nums[i]+cMax);
            maxSum=Math.max(maxSum, cMax);
            cMin=Math.min(nums[i], nums[i]+cMin);
            minSum=Math.min(minSum, cMin);
        }
        if(maxSum<0) return maxSum;
        return Math.max(maxSum, t-minSum);
    }
}