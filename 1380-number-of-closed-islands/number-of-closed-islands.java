class Solution {
    int n,m;
    boolean dfs(int[][] grid , int r,int c){
        if(r<0 || r>=n || c<0 || c>=m){//out of bound
            return false;
        }
        if(grid[r][c]==1){//water
            return true;
        }
        grid[r][c]=1;//mark visited
        boolean up = dfs(grid , r-1,c);
        boolean down = dfs(grid , r+1,c);
        boolean left = dfs(grid , r,c-1);
        boolean right = dfs(grid , r,c+1);
        return  up && down && left && right;

    }
    public int closedIsland(int[][] grid) {
        n  = grid.length;
        m = grid[0].length;
        int count =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){//land
                    if(dfs(grid,i,j)==true){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}