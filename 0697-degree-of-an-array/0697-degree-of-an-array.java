class Solution {
    public int findShortestSubArray(int[] nums) {

        HashMap<Integer,Integer>freq = new HashMap<>();
        HashMap<Integer,Integer>first = new HashMap<>();
        HashMap<Integer,Integer>last = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);

            if(!first.containsKey(nums[i])) {
                first.put(nums[i], i);
            }

            last.put(nums[i], i);
        }

        int degree = 0;

        for(int value:freq.values()) {
            degree=Math.max(degree, value);
        }
        int ans=nums.length;
        for(int num:freq.keySet()) {

            if(freq.get(num)==degree) {
                int length=last.get(num)-first.get(num)+1;
                ans = Math.min(ans,length);
            }
        }

        return ans;
    }
}