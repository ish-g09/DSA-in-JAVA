class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0; i<n; i++){
            hs.add(nums[i]);
        }
        for(int i=1; ; i++){
            if(!hs.contains(k*i)){
                return k*i;

            }
        }
        
    }
}