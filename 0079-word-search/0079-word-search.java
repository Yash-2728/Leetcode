class Solution {
    int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    int n,m;
    public boolean exist(char[][] board, String word) {
         m = board.length;
         n = board[0].length;

        if(m * n < word.length()){
            return false;
        }
        
        

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++ ){
                if(board[i][j]==word.charAt(0) && find(i,j, 0, word, board)){
                    return true;
                }
            }
        }

        return false;
        
    }

    public boolean find(int i, int j, int idx, String word,char[][] board){

        if(idx>=word.length()){
            return true;
        }

        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!=word.charAt(idx) ){
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '*';

        for(int dir[] : directions){
            int a = i + dir[0];
            int b = j+ dir[1];

            if(find(a,b, idx+1, word, board)){
                return true;
            }
        }

        board[i][j]= temp;
        return false;




    }
}