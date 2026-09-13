class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n=img1.length;
        int dx=2*n-1;
        int dy=2*n-1;
        int maxo=0;
        
        for(int i=0; i<dx; i++){
            for(int j=0; j<dy; j++){
                int shiftx=i-n+1;
                int shifty=j-n+1;
                int curr=0;
                for(int r=0; r<n; r++){
                    for(int c=0; c<n; c++){
                        int nr=r+shiftx;
                        int nc=c+shifty;
                        if(nr>=0 && nr<n && nc>=0 && nc<n && img1[r][c]==1 && img2[nr][nc]==1){
                            curr++;
                        }
                    }
                }
                maxo=Math.max(maxo, curr);
            }
            
        }
        return maxo;
    }
}