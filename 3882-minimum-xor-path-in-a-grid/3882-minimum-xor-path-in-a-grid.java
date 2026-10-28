class Solution {
    public int minCost(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] arr=grid;
        Set<Integer>[][] dp=new HashSet[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                dp[i][j]=new HashSet<>();
            }
        }
        dp[0][0].add(grid[0][0]);
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i==0 && j==0){
                    continue;
                }
                if(i>0){
                    for(int val:dp[i-1][j]){
                        int newXor = val^grid[i][j];
                        dp[i][j].add(newXor);
                    }
                }
                if(j>0){
                    for(int val:dp[i][j-1]){
                        int newXor = val^grid[i][j];
                        dp[i][j].add(newXor);
                    }
                }
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int val:dp[m-1][n-1]){
            if(val<ans){
                ans=val;
            }
        }
        return ans;
        
    }
}