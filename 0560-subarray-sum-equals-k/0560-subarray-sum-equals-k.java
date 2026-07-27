class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        HashMap<Integer, Integer>hm=new HashMap<>();
        hm.put(0,1);
        int cnt=0;
        for(int i=0; i<n; i++){
            sum+=nums[i];
            int diff=sum-k;
            if(hm.containsKey(diff)) cnt+=hm.get(diff);
            hm.put(sum, hm.getOrDefault(sum, 0)+1);
            
        }
        return cnt;
    }
}