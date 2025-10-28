class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int [][] directions = {{1,0}, {-1,0}, {0,1}, {0, -1}};
        Queue<int[]> q = new LinkedList<>();
        int[][] result = new int[n][m];
        for (int i[]: result ){
            Arrays.fill(i, -1);
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(mat[i][j]==0){
                    result[i][j] =0;
                    q.offer(new int[]{i, j});
                }
                
            }
        }

        while(!q.isEmpty()){
            int curr[] = q.poll();
            int i = curr[0];
            int j = curr[1];

            for(int dir[]: directions){
                int new_i = i+ dir[0];
                int new_j = j+ dir[1];

                if(new_i>=0 && new_i<n && new_j>=0 && new_j<m && result[new_i][new_j]==-1){
                    result[new_i][new_j] = result[i][j]+1;
                    q.offer(new int[]{new_i, new_j});
                }
            }


        }

        return result;

        
    }
}