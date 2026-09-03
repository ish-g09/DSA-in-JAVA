class Solution {
    public int uniquePaths(int m, int n) {
        
        int mod=(int)1e9*2;
        int dp[][]=new int[m+1][n+1];
        dp[0][0]=1;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i>0){
                    dp[i][j]+=dp[i-1][j];
                }
                if(j>0){
                    dp[i][j]+=dp[i][j-1];
                }

            }
        }
        return dp[m-1][n-1];
    }
}