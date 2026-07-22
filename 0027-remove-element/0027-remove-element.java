class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]!=val) continue;
            if(nums[i]==val){
                int j=i+1;
                while(j<n && nums[j]==val){
                    j++;
                }
                if(j<n){
                    nums[i]=nums[j];
                    nums[j]=val;
                    continue;
                }
            }
        }
        int k=0;
        for(int i=0; i<n; i++){
            if(nums[i]!=val) k++;
            else break;
        }
        return k;
    }
}