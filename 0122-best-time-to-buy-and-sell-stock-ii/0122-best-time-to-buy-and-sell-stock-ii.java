class Solution {
    public int maxProfit(int[] prices) {
       //i feel this is a 2d dp question since here we have the choice of either selling if profit, or not selling. then also later we can buy a stock and sell that too || we can continue with teh previous stock and see where we are getting maximum benefit
       int n=prices.length;
       int dp[][]=new int[n][2];
       dp[0][0]=0;
       dp[0][1]=-prices[0];
       for(int i=1; i<n; i++){
        dp[i][0]=Math.max(dp[i-1][0], dp[i-1][1]+prices[i]);
        dp[i][1]=Math.max(dp[i-1][1], dp[i-1][0]-prices[i]);
       }
       return Math.max(dp[n-1][1], dp[n-1][0]);

    }
}