class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        boolean visited[][]=new boolean[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]==word.charAt(0)){
                    if(dfs(board, visited, i,j,0,word)) return true;
                    
                }
            }
        }
        return false;

    }
    
    boolean dfs(char board[][], boolean visited[][], int row, int col, int index, String word){
        
        int dr[]={-1,0,1,0};
        int dc[]={0,1,0,-1};
        if(visited[row][col] || board[row][col]!=word.charAt(index)) return false;
        if(word.length()-1==index) return true;
        visited[row][col]=true;
            
            for(int k=0; k<4; k++){
                int r=row+dr[k];
                int c=col+dc[k];

                if(r>=0 && c>=0 && r<board.length && c<board[0].length){
                    
               if(dfs(board, visited, row+dr[k], col+dc[k], index+1,word)) return true;
                }
            }
        
        visited[row][col]=false;
        return false;
    }
}