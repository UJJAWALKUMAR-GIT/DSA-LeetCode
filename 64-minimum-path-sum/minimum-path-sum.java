class Solution {
    public int pathSum(int[][] grid,int row, int col, int m ,int n,int[][] dp){
        if (row >= m || col >= n) return Integer.MAX_VALUE;
        if(dp[row][col]!=-1) return dp[row][col];
        if (row == m - 1 && col == n - 1) return grid[row][col];
        int take1 = pathSum(grid,row+1,col,m,n,dp);
        int take2 = pathSum(grid,row,col+1,m,n,dp);
        return dp[row][col]=grid[row][col] + Math.min(take1, take2);
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        return pathSum(grid,0,0,m,n,dp);
    }
}