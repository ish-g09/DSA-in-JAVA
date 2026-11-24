class Solution {
    class Pair{
        int row;
        int col;
        Pair(int row, int col){
            this.row=row;
            this.col=col;
        }
    }
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dr[]={-1,0,1,0};
        int dc[]={0,1,0,-1};
        int fresh=0;
        boolean vis[][]=new boolean[m][n];
        Queue<Pair>q=new LinkedList<>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==0) continue;
                if(grid[i][j]==1) fresh++;
                if(grid[i][j]==2){
                    q.offer(new Pair(i,j));
                    vis[i][j]=true;
                }

            }
        }
        if(fresh==0) return 0;
        int cnt=0;
        while(!q.isEmpty()){
            int size=q.size();
            if(fresh==0) return cnt;
            for(int i=0; i<size; i++){
                Pair p=q.poll();
                int row=p.row;
                int col=p.col;
                for(int k=0; k<4; k++){
                    int r=row+dr[k];
                    int c=col+dc[k];
                    if(r>=0 && r<m && c>=0 && c<n && !vis[r][c] && grid[r][c]==1){
                        q.offer(new Pair(r,c));
                        grid[r][c]=2;
                        fresh--;
                    }
                }
            }
            cnt++;
            

        }
        return -1;
        
    }
}