class Solution {

    public static int numberOfIslands(int grid[][]){
        boolean visited[][] = new boolean[grid.length][grid[0].length];
        int isLands = 0;

        for(int i=0; i<grid.length; i++){
            for(int j=0 ;j<grid[0].length; j++){
                if(grid[i][j]==1 && !visited[i][j]){
                    DFS(grid, i, j, visited);
                    isLands++;

                }
            }
        }

        return isLands;
    }

    public static void DFS(int grid[][], int i, int j, boolean visited[][]){
        if(i<0 || i>= grid.length|| j< 0 || j>= grid[0].length || grid[i][j]==0 || visited[i][j] ){
            return ;
        }

        visited[i][j] = true;

        DFS(grid, i-1, j, visited);
        DFS(grid, i+1, j, visited);
        DFS(grid, i, j-1, visited);
        DFS(grid, i, j+1, visited);
    }

    public int minDays(int[][] grid) {
        int isLands = numberOfIslands(grid);

        if(isLands > 1 || isLands==0){
            return 0;
        }
        else{
            for(int i=0; i<grid.length; i++){
            for(int j=0 ; j<grid[0].length; j++){
                if(grid[i][j]==1){
                    grid[i][j]=0;
                    isLands = numberOfIslands(grid);
                    grid[i][j] = 1;
                    if(isLands > 1 || isLands==0){
                        return 1;
                    }

                    
                }
            }
        }
        }

        

        return 2;
    }
}