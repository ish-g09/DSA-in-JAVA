class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int right=0;
        
        int window=Integer.MAX_VALUE;
        int sum=0;
        


    while(right < nums.length) {
    sum += nums[right];
    right++;
    while (sum >= target) {
        window = Math.min(window, right - left);
        sum -= nums[left];
        left++;
    }
    }

    return window == Integer.MAX_VALUE ? 0 : window;
        
    }
}