class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                list.add(matrix[i][j]);
            }
        }
        
        int k =0;
        
        
        for(int j=n-1; j>=0; j--){
            for(int i=0; i<m; i++){
                matrix[i][j] = list.get(k);
                k++;
                
            }
        }
        
        
    }
}