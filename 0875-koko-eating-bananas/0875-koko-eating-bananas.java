class Solution {
    long totalhr(int mid, int[] piles){
        long t=0;
        for(int i=0; i<piles.length; i++){
            t+=(piles[i]+mid-1)/mid;
        }
        return t;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=1;
        
        for(int i=0; i<piles.length; i++){
            high=Math.max(high, piles[i]);
        }

        while(low<=high){
            int mid=low+(high-low)/2;
            long hours=totalhr(mid, piles);
            if(hours<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;

        
    }
}