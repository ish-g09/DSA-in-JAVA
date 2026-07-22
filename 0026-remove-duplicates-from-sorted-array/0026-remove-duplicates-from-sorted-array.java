class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        int n=nums.length;
        if (nums.length == 0) return 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]!=nums[i]){
                nums[k]=nums[i-1];
                k++;
            }
        }
        nums[k] = nums[n-1];
        k++;
        return k;
    }
}