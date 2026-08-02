class Solution {
    public void gameOfLife(int[][] board) {
        int m=board.length;
        int n=board[0].length;
        int dr[]={-1,-1,0,1,1,1,0,-1};
        int dc[]={0,1,1,1,0,-1,-1,-1};
         int[][] copy = new int[m][n];

        for (int i = 0; i < m; i++)
            copy[i] = board[i].clone();
        
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int cnt=0;
                for(int k=0; k<8; k++){
                    int row=i+dr[k];
                    int col=j+dc[k];
                    if(row>=0 && col>=0 && row<m && col<n && copy[row][col] == 1){
                        cnt++;
                    }
                    }
                    if (copy[i][j] == 1) {
                        if (cnt < 2 || cnt > 3)
                            board[i][j] = 0;
                    } else {
                        if (cnt == 3)
                            board[i][j] = 1;
                    }
                    
                }
        }
        
    }
}