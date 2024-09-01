class Solution {
    int dp[][];
    public int uniquePaths(int m, int n) {// recursion and memoisation
        dp = new int[n][m];
        for(int row[]: dp){
            Arrays.fill(row, -1);
        }
        
        return solve(n, m, 0, 0);
    }
    
    public int solve(int n, int m , int i, int j){
        if(i>=n || i<0 || j>=m || j<0){
            return 0;
        }
        
        if(i== n-1 && j==m-1){
            return 1;
        }
        
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        
        return dp[i][j] = solve(n, m, i, j+1)  + solve(n, m, i+1, j);
    }
    
}