class Solution {
    int count;
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        count=0;
        for (int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j]=='1'){
                    dfs(grid, i, j,n,m);
                    count++;
                }
            }
        }

        return count;

    }

    public void dfs(char[][] grid , int i, int j, int n, int m){
        if(i<0 || i>=n || j<0 || j>=m || grid[i][j]!='1'){
            return;
        }

       grid[i][j]='#';

        dfs(grid, i , j+1, n, m);
        dfs(grid, i+1, j, n, m);
        dfs(grid, i-1, j, n, m );
        dfs(grid, i, j-1, n, m);
    }
}