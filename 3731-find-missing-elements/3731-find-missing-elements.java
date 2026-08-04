class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer>missing=new ArrayList<>();
        int n=nums.length;
        HashMap<Integer, Integer>hm=new HashMap<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            min=Math.min(nums[i], min);
            max=Math.max(nums[i], max);
            hm.put(nums[i],i);
        }
        for(int i=min; i<=max; i++){
            if(!hm.containsKey(i)) missing.add(i);
        }
        return missing;
    }
}