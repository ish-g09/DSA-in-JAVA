class Solution {
    long dfs(int row, int col, long sum, int grid[][], boolean vis[][]){
        int dr[]={-1,0,1,0};
        int dc[]={0,1,0,-1};
        sum=grid[row][col];
        vis[row][col]=true;
        for(int i=0; i<4; i++){
            int r=row+dr[i];
            int c=col+dc[i];
            if(r>=0 && r<grid.length && c>=0 && c<grid[0].length && grid[r][c]!=0 && !vis[r][c]){
                sum+=dfs(r,c,sum,grid, vis);
            }
            
        }
        return sum;
    }
    public int countIslands(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int cnt=0;
        boolean vis[][]=new boolean[m][n];
        long value=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==0) continue;
                else if(grid[i][j]!=0 && !vis[i][j]){
                    value=dfs(i, j, 0, grid, vis);
                    if(value%k==0) cnt++;
                }
                
            }
        }
        return cnt;

    }
}