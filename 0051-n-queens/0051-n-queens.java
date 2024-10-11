class Solution {
    public List<List<String>> result = new ArrayList<>();
    
    
    public List<List<String>> solveNQueens(int n) {
        
        
        
        

        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        chessBoard(board, 0, n );
        return result;
    }

    public void chessBoard(char[][] board, int row, int n){
       
        if(row == n){
             List<String> list = new ArrayList<>();
            for(int i=0; i<n; i++){
                list.add(new String(board[i]));
            }
            result.add(list);
            return;
        }
        for(int i=0; i<n; i++){
            if(isSafe(board, row, i)){
                board[row][i] = 'Q';
                chessBoard(board, row+1, n);
                board[row][i] = '.';
            }
            // board[row][i] = '.';
        }
    }

    public boolean isSafe(char[][] board, int row , int col){
        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        for(int i=col-1; i>=0; i--){
            if(board[row][i]=='Q'){
                return false;
            }
        }

        for(int i= row-1, j= col-1; i>=0 && j>=0 ; i--, j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        for(int i=row-1, j= col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }



        return true;
    }
}