class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        helper(0, target, list, result, candidates);
        
        return result;
    }
    
    public static void helper(int idx, int target, List<Integer> list, List<List<Integer>> result, int candidates[] ){
        if(target<0  ){
            return;
        }
        if(target==0 ){
            
            result.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=idx; i<candidates.length; i++){
            if(i>idx && candidates[i]==candidates[i-1]){
                continue;
            }
            
            
               list.add(candidates[i]);
        helper(i+1, target-candidates[i], list, result, candidates);
        list.remove(list.size()-1);
        // helper(i+1, target, list, result, candidates);
            
        }
        
        
       
    }
}