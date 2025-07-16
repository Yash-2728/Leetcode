/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
var setZeroes = function(matrix) {
    var n = matrix.length;
    var m = matrix[0].length;
    function convertMatrix(matrix, n, m){
        for(var i =0; i<n; i++){
            for(var j=0; j<m; j++){
                if(matrix[i][j]===0){
                    convertRow(matrix,i);
                    convertCol(matrix,j);
                }
            }
        }

        for(var i=0; i<n; i++){
            for(var j =0; j<m; j++){
                if(matrix[i][j]===-1){
                    matrix[i][j]=0;
                }
            }
        }


    }

    function convertRow(matrix,i){
        for(var j=0; j<m; j++){
            if(matrix[i][j]!==0){
                matrix[i][j]=-1;
            }
        }
    }

    function convertCol(matrix, j){
        for(var i=0; i<n; i++){
            if(matrix[i][j]!==0){
                matrix[i][j]=-1;
            }
        }
    }
    convertMatrix(matrix,n, m);
};