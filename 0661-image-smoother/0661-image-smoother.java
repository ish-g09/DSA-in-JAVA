class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m=img.length;
        int n=img[0].length;
        int result[][]=new int[m][n];
        int dr[]={-1,-1,0,1,1,1,0,-1};
        int dc[]={0,1,1,1,0,-1,-1,-1};
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int sum=img[i][j];
                int cnt=1;
                for(int k=0; k<8; k++){
                    int row=dr[k]+i;
                    int col=dc[k]+j;
                    if(row>=0 && row<m && col>=0 && col<n){
                        sum+=img[row][col];
                        cnt++;

                    }
                }
                result[i][j]=sum/cnt;
            }
        }
        return result;
    }
}