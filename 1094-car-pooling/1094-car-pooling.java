class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int diff[]=new int[1001];
        int n=trips.length;
        for(int []trip:trips){
            diff[trip[1]]+=trip[0];
            diff[trip[2]]-=trip[0];
        }
        int curr=0;
        for(int i=0; i<1001; i++){
            curr+=diff[i];
            if(curr>capacity) return false;
        }
        return true;

    }
}