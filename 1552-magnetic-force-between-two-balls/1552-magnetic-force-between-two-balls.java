class Solution {
    boolean canplace(int[]position, int m, int mid){
        int first=position[0];
        int bplaced=1;
        for(int i=1; i<position.length; i++){
            if(position[i]-first>=mid){
                bplaced++;
                if(bplaced==m) return true;
                first=position[i];

            }
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n=position.length;
        int low=1;
        int high=position[n-1]-position[0];
        
            while(low<=high){
                int mid=low+(high-low)/2;
                if(canplace(position,m,mid)){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            return high;
        

    }
}