class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int k=nums[i];
            int digitsum=0;
            while(k>0){
                digitsum+=k%10;
                k/=10;
            }
            if(digitsum==i) return i;
        }
        return -1;
    }
}