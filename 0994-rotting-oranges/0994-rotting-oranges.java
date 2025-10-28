class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int freshCount=0;
        Queue<int[]> q = new LinkedList<>();
        int minutes=0;

        int directions[][] = {{1,0}, {0, 1}, {-1,0}, {0, -1}};

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
                else if(grid[i][j]==1){
                    freshCount++;
                }
            }
        }

        if(freshCount==0){
            return 0;
        }

        while(!q.isEmpty()){
            int N = q.size();

            while(N-->0){
                int curr[] = q.poll();
                int i = curr[0];
                int j = curr[1];

                for(int dir[]: directions){
                    int new_i = i+ dir[0];
                    int new_j = j+ dir[1];

                    if(new_i>=0 && new_i<n && new_j>=0 && new_j<m && grid[new_i][new_j]==1){
                        grid[new_i][new_j] = 2;
                        q.offer(new int[]{new_i, new_j});
                        freshCount--;
                    }
                }


            }

            minutes++;
        }

        return freshCount==0 ? minutes-1:-1;
    }
}