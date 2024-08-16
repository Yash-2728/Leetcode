class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size()-1);
        
        int result = 0;
        
        for(int i=1; i<arrays.size(); i++){
            int maxCurr = arrays.get(i).get(arrays.get(i).size()-1);
            int minCurr = arrays.get(i).get(0);
            
            result = Math.max(result, Math.max(Math.abs(maxCurr-min), Math.abs(minCurr-max)));
            
            min = Math.min(min, minCurr);
            max = Math.max(max, maxCurr);
        }
        
        return result;
        
        
    }
}