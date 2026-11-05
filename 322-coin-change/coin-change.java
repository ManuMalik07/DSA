class Solution {
    private int helper(int[] coins, int amount , int n,int[][] dp){
        if(amount ==0){
            return 0;
        }
        if(n==0){
            return Integer.MAX_VALUE -1;
        }
        if(dp[n-1][amount] != -1){
            return dp[n-1][amount];
        }
        if(coins[n-1]<= amount){
            int include = helper(coins,amount-coins[n-1],n,dp);
            int exclude = helper(coins,amount,n-1,dp);
            return dp[n-1][amount]=Math.min(1+include,exclude);
        }else{
            return dp[n-1][amount]=helper(coins,amount,n-1,dp);
        }
    }
    public int coinChange(int[] coins, int amount) {
        int n= coins.length;
        int[][] dp = new int[n+1][amount+1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int ans = helper(coins,amount,n,dp);
        if(ans == Integer.MAX_VALUE -1)return -1;
        return ans ;
        
    }
}