class Solution {
    int finddays(int weights[], int mid){
        int t=1;
        int w=0;
        for(int i=0; i<weights.length; i++){
            if(w+weights[i]<=mid){
                w+=weights[i];
            }
            else {
                t++;
                w=weights[i];
            }
            
        }
        return t;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=1;
        int high=1;
        for(int i=0; i<weights.length; i++){
            low=Math.max(low, weights[i]);
            high+=weights[i];
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int d=finddays(weights, mid);
            if(d>days){
                low=mid+1;
            }
            else high=mid-1;
        }
        return low;
    }
}