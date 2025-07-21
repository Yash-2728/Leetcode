/**
 * @param {number[][]} intervals
 * @return {number[][]}
 */
var merge = function(intervals) {
    var i=0; 
    while(i<intervals.length -1){
        var cs = intervals[i][0];
        var ce = intervals[i][1];
        var merge = false;

        for(var j=i+1; j<intervals.length; j++){
            var ns = intervals[j][0];
            var ne = intervals[j][1];

            if(!(cs > ne || ce < ns)){
                intervals[i][0] = Math.min(cs, ns);
                intervals[i][1] = Math.max(ce, ne);
                intervals.splice(j,1);
                 merge = true;
                break;
            }

            
           
        }

        if(!merge){
            i++;
        }
    }

    return intervals;
};