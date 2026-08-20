class Solution {
    // static int cs(int i,int n,int[] dp){
    //     if(i==n){
    //         return 1;
    //     }
    //     if(i>n){
    //         return 0;
    //     }
    //     if(dp[i] !=0){
    //         return dp[i];
    //     }
    //     int oneStep=cs(i+1,n,dp);
    //     int twoStep= cs(i+2,n,dp);
    //     return dp[i]=oneStep+twoStep;
    // }
    // public int climbStairs(int n) {
    //     int[] dp  = new int[n+1];
    //     int count=cs(0,n,dp);
    //     return count;
        
        
    // }
        public int climbStairs(int n) {
            if(n==1){
                return 1;
            }
            if(n==2){
                return 2;
            }
        int[] dp  = new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];

        
        
    }
}