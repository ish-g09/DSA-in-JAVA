class Solution {
    boolean dfs(int row, int col, int grid[][], boolean vis[][], boolean flag){
        vis[row][col]=true;
        int dr[]={-1,0,1,0};
        int dc[]={0,1,0,-1};
        for(int i=0; i<4; i++){
            int r=row+dr[i];
            int c=col+dc[i];
            if(r>=0 && r<grid.length && c>=0 && c<grid[0].length && !vis[r][c] && grid[r][c]==0){
                if(r==0 || c==0 || r==grid.length-1 || c==grid[0].length-1){
                    flag=false;
                    
                }
                flag=dfs(r,c,grid,vis, flag);
                
            }
        }
        return flag;
    }
    public int closedIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean vis[][]=new boolean[m][n];
        int cnt=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1) continue;
                if(i==0 || j==0 || i==m-1 || j==n-1 && grid[i][j]==0 && !vis[i][j]){
                    dfs(i, j, grid, vis,false);
                }
                else if(grid[i][j]==0 && !vis[i][j]){
                    if(dfs(i,j,grid,vis,true))
                    cnt++;
                }
                
            }
        }
        return cnt;


    }
}