class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int sum=0;
        int cnt=0;
        for(int i=0; i<nums.length; i++){
            sum=nums[i];
            if(sum==k) cnt++;
            
            int j=i+1;
            while(j<nums.length){
                sum+=nums[j];
                if(sum==k){
                    cnt++;
                    
                }
                j++;
            }

        }
        return cnt;
    }
}