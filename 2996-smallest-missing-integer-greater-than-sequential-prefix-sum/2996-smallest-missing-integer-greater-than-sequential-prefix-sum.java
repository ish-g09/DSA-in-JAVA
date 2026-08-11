class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0]+1;
        HashSet<Integer>hs=new HashSet<>();
        int productM=0;
        for(int i=0; i<n; i++){
            hs.add(nums[i]);
            
        }
        int i=1;
        while(i<n && (nums[i]==nums[i-1]+1)){
                productM+=nums[i-1];
                i++;
        }
        productM+=nums[i-1];
        
        while(hs.contains(productM)){
            productM+=1;
        }
        return productM;


    }
}