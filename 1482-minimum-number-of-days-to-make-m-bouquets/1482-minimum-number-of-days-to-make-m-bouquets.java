class Solution {
    boolean isPossible(int m, int k, int []bloomDay, int mid){
        int t=0;
        int cons=0;
        for(int i=0; i<bloomDay.length; i++){
            if(bloomDay[i]<=mid){ cons++;
            if(cons==k){
                cons=0;
                t++;
            }
            }
            else cons=0;
            
        }
        return (t>=m);
    }
    public int minDays(int[] bloomDay, int m, int k) {
        long flowN=(long)m*k;
        if(flowN>bloomDay.length) return -1;
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int i=0; i<bloomDay.length; i++){
            low=Math.min(low, bloomDay[i]);
            high=Math.max(high, bloomDay[i]);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(m,k,bloomDay,mid)){
                high=mid-1;
            }
            else low=mid+1;
        }
        return low;


    }
}