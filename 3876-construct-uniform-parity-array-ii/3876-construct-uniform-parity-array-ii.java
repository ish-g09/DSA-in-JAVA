class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        int odd=0;
        int even=0;
        int seven=Integer.MAX_VALUE;
        int sodd=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if((nums1[i] & 1)==1){
                odd++;
                if(sodd>nums1[i]) sodd=nums1[i];
            }
            else{
                even++;
                if(seven>nums1[i]) seven=nums1[i];
            }
            
        }
        if(odd==n || even==n) return true;
        if(sodd>seven) return false;
        return true;
    }
}