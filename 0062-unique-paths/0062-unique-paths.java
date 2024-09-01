class Solution {
    int t[][];
    public int uniquePaths(int m, int n) {// recursion and memoisation
        t = new int[n][m];
        for(int row[]: t){
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
        
        if(t[i][j]!=-1){
            return t[i][j];
        }
        
        return t[i][j] = solve(n, m, i, j+1)  + solve(n, m, i+1, j);
    }
    
}