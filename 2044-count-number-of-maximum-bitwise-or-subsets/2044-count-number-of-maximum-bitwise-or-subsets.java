class Solution {
    int generateSub(int nums[], int bor, int cnt, int res, int index){
        if(index==nums.length){
            if(res==bor) cnt++;
            return cnt;
        }

        
        cnt=generateSub(nums,bor,cnt,res|nums[index],index+1);
        cnt=generateSub(nums,bor,cnt,res,index+1);
        return cnt;
    }
    public int countMaxOrSubsets(int[] nums) {
        int n=nums.length;
        int bor=nums[0];
        for(int i=1; i<n; i++){
            bor=bor | nums[i];
        }
        
        int res=generateSub(nums, bor, 0, 0,0);
        return res;
    }
}