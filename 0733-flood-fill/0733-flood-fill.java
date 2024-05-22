class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
       
        int  k = image[sr][sc];
        boolean seen[][] = new boolean[image.length][image[0].length];
        
        dfs(image, sr, sc , k, color, seen );
        
        return image;
        
        
        
    }
    
    public void dfs(int[][] image , int i , int j, int k , int color, boolean seen[][]){
        if(i<0 || i==image.length || j<0 || j==image[0].length ){
            return ;
        }
        
        if(image[i][j]!=k || seen[i][j]){
            return ;
        }
        
        image[i][j] = color;
        seen[i][j] = true;
        
        dfs(image, i+1, j, k, color , seen);
        dfs(image, i, j+1, k, color , seen);
        dfs(image, i-1, j, k, color , seen);
        dfs(image, i, j-1, k, color , seen);
    }
}