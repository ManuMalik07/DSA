class Solution {
    int n;
    int m;
    long sum=0;
    void dfs(int[][] grid , int r , int c ){
        if(r<0 || r>=n || c<0 || c>=m || grid[r][c]==0){
            return ;
        }
        
        sum += grid[r][c];
        grid[r][c]=0;//mark visited
        
        dfs(grid,r-1,c);
        dfs(grid,r+1,c);
        dfs(grid,r,c-1);
        dfs(grid,r,c+1);
        
    }
    public int countIslands(int[][] grid, int k) {
        n= grid.length;
        m=grid[0].length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]>0){
                    sum =0;
                    dfs(grid,i,j);
                    if(sum %k ==0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}