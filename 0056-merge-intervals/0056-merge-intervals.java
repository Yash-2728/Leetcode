class Solution {
    public int[][] merge(int[][] intervals) {
        
        
        int i=0;
        while(i<intervals.length-1){
           int cs = intervals[i][0];
            int ce = intervals[i][1];
            boolean merge = false;
            
            for(int j=i+1; j<intervals.length; j++){
                int ns = intervals[j][0];
                int ne = intervals[j][1];
                
                if(!(cs > ne || ce<ns)){
                    // merge them 
                    intervals[i][0] = Math.min(cs, ns);
                    intervals[i][1] = Math.max(ce,ne);
                    
                    for(int k=j; k<intervals.length-1; k++){
                        intervals[k] = intervals[k+1];
                    }
                    intervals = Arrays.copyOf(intervals, intervals.length-1);
                    merge = true;
                    break;
                }
            }
            
            if(!merge){
                i++;
            }
        }
        
        
        return intervals;
    }
}