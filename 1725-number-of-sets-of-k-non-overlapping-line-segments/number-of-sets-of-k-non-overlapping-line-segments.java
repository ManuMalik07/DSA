class Solution {
    public int numberOfSets(int n, int k) {
        int MOD = 1_000_000_007;
        int totalPoints = n + k - 1;
        int choose = 2 * k;
        
        // If it's impossible to pick 2k items out of totalPoints
        if (totalPoints < choose) {
            return 0;
        }
        
        // Compute Pascal's Triangle up to totalPoints
        int[][] c = new int[totalPoints + 1][choose + 1];
        
        for (int i = 0; i <= totalPoints; i++) {
            c[i][0] = 1; // nC0 is always 1
            for (int j = 1; j <= Math.min(i, choose); j++) {
                c[i][j] = (c[i - 1][j - 1] + c[i - 1][j]) % MOD;
            }
        }
        
        return c[totalPoints][choose];
    }
}