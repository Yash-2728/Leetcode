/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
    var result = [];

    for(var row=1; row<=numRows; row++){
        result.push(generateRow(row));
    }

    return result;
};

function generateRow(row){
    var ans=1;
    var ansRow=[1];

    for(var col=1; col<row; col++){
        ans = ans * (row-col);
        ans = ans/ col;
        ansRow.push(ans);
    }

    return ansRow;

}