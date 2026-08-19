class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        hs.add(nums[0]);
        for(int i=1; i<nums.length; i++){
            if(hs.contains(nums[i])) return true;
            else hs.add(nums[i]);
        }
        return false;
    }
}