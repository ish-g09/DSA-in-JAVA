class Pair{
    int row;
    int col;
    Pair(int row, int col){
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int indegree[][]=new int[m][n];
        int dr[]={-1,0,1,0};
        int dc[]={0,1,0,-1};
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                for(int k=0; k<4; k++){
                    int row=dr[k]+i;
                    int col=dc[k]+j;
                    if(row>=0 && row<m && col>=0 && col<n && matrix[row][col]>matrix[i][j]){
                        indegree[row][col]++;
                    }
                }
            }
        }
        Queue<Pair>q=new LinkedList<>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(indegree[i][j]==0){
                    q.offer(new Pair(i,j));
                }
            }
        }
        int ans=0;
        while(!q.isEmpty()){
            int size=q.size();
            ans++;
            for(int i=0; i<size; i++){
                int row=q.peek().row;
                int col=q.peek().col;
                q.poll();
                
                for(int k=0; k<4; k++){
                    int r=row+dr[k];
                    int c=col+dc[k];
                    if(r>=0 && r<m && c>=0 && c<n && matrix[r][c]>matrix[row][col] && indegree[r][c]>0){
                        
                        indegree[r][c]--;
                        if(indegree[r][c]==0) q.offer(new Pair(r,c));
                    }
                }

            }
        }
        return ans;
    }
}