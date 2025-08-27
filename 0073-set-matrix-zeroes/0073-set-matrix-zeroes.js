/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
var setZeroes = function(matrix) {
    var n = matrix.length;
    var m = matrix[0].length;
    const rows = new Set();
    const cols = new Set();
    function convertMatrix(matrix, n, m){
        for(var i =0; i<n; i++){
            for(var j=0; j<m; j++){
                if(matrix[i][j]===0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for(var i=0; i<n; i++){
            for(var j =0; j<m; j++){
               if(rows.has(i)|| cols.has(j)){
                matrix[i][j] =0;
               }
            }
        }


    }

    convertMatrix(matrix,n, m);

  

    
};