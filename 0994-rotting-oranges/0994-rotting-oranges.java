class Pair{
    int i;
    int j;
    Pair(int i, int j){
        this.i=i;
        this.j=j;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        //0-empty
        //1-fresh
        //2-rotten
        int fresh=0;
        Queue<Pair>q=new LinkedList<>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1) fresh++;
                if(grid[i][j]==2) q.offer(new Pair(i,j));
            }
        }
        if (fresh == 0) return 0;
        int dr[]={-1,0,1,0};
        int dc[]={0,1,0,-1};
        int step=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int t=0; t<size; t++){
            Pair p=q.poll();
            int i=p.i;
            int j=p.j;
            for(int k=0; k<4; k++){
                int row=dr[k]+i;
                int col=dc[k]+j;
                if(row>=0 && col>=0 && row<m && col<n){
                    if(grid[row][col]==1){
                        grid[row][col]=2;
                        q.offer(new Pair(row, col));
                        fresh--;
                        
                        
                    }
                }
            }
            
            
            }
            step++;
            if(fresh==0) return step;
        }
        return -1;
        

    }
}