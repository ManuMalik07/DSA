class Solution {
    static int cs(int i,int n,int[] dp){
        if(i==n){
            return 1;
        }
        if(i>n){
            return 0;
        }
        if(dp[i] !=0){
            return dp[i];
        }
        int oneStep=cs(i+1,n,dp);
        int twoStep= cs(i+2,n,dp);
        return dp[i]=oneStep+twoStep;
    }
    public int climbStairs(int n) {
        int[] dp  = new int[n+1];
        int count=cs(0,n,dp);
        return count;
        
        
    }
}