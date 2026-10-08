class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int k=2;
        int dp[][][]=new int[n][2][k+1];
        
        for(int i=0; i<=k; i++){
        dp[0][0][i]=0;
        dp[0][1][i]=-prices[0];
        }
        
        for(int i=1; i<n; i++){
            for(int t=0; t<=k; t++){

                dp[i][0][t]=dp[i-1][0][t];
                if(t>0){
                    dp[i][0][t]=Math.max(dp[i-1][0][t], dp[i-1][1][t-1]+prices[i]);
                }
            
            dp[i][1][t]=Math.max(dp[i-1][1][t], dp[i-1][0][t]-prices[i]);
            }
        }
        return Math.max(dp[n-1][0][0], Math.max(dp[n-1][0][1], dp[n-1][0][2]));
    }
}